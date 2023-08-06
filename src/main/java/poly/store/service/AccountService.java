package poly.store.service;

import java.util.List;

import poly.store.entity.Account;

public interface AccountService {
	Account findById(String username);

	List<Account> findAll();

	List<Account> getAdministrators();
}
