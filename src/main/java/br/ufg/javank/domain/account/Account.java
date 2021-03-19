package br.ufg.javank.domain.account;

public interface Account {
	public int getNumber();
	
	public int getDigit();
	
	public int getAgency();
	
	public boolean withDraw(double amount);
	
	public boolean deposit(double amount);
	
	public boolean transfer(double amount, Account destination);

	public double getBalance();
}
