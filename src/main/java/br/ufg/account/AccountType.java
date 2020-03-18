package br.ufg.account;

public enum AccountType {
	SAVING(1), SPECIAL(2);
	
	private final int value;
	
	AccountType(int optionValue) {
		value = optionValue;
	}

	public int getValue() {
		return value;
	}
}
