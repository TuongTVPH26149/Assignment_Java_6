package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.entity.Account;
import poly.store.repository.AccountRepository;
import poly.store.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Account findById(String username) {
		return accountRepository.findById(username).get();
	}

	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public List<Account> getAdministrators() {
		return accountRepository.getAdministrators();
	}

}
