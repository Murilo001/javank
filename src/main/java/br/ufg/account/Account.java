package br.ufg.account;

interface Account {
	public int getNumber();
	
	public int getDigit();
	
	public int getAgency();
	
	public boolean withDraw(float amount);
	
	public boolean deposit(float amount);
	
	public boolean transfer(float amount, Account destination);

	public float getBalance();
}
