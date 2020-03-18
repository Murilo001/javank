package br.ufg.client;

import java.util.ArrayList;
import java.util.List;
import br.ufg.account.*;

public class Client {
	private int id;

	private List<Account> accounts = new ArrayList<Account>();

	public int getId() {
		return this.id;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public boolean createAccount(AccountType type) {
		Account clientNewAccount;
		switch (type) {
		case SPECIAL:
			clientNewAccount = new Special();
			break;
		case SAVING:
			clientNewAccount = new Saving();
			break;
		default:
			return false;
		}
		this.accounts.add(clientNewAccount);
		return true;
	}
}
