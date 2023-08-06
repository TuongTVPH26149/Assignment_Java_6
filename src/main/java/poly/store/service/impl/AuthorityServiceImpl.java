package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.entity.Account;
import poly.store.entity.Authority;
import poly.store.repository.AccountRepository;
import poly.store.repository.AuthorityRepository;
import poly.store.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	AuthorityRepository authorityRepository;
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = accountRepository.getAdministrators();
		return authorityRepository.authoritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		return authorityRepository.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return authorityRepository.save(auth);
	}

	@Override
	public void delete(Integer id) {
		authorityRepository.deleteById(id);
	}
}
