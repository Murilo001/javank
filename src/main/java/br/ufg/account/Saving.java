package br.ufg.account;

public class Saving implements Account {

	private float balance;
	
	private float interestPercent;
	
	private int birthDay;
	
	private int number;
	
	private int digit;
	
	private int agency;
	
	public int getNumber() {
		return number;
	}
	
	public int getDigit() {
		return digit;
	}
	
	public int getAgency() {
		return agency;
	}
	
	public boolean withDraw(float amount) {
		if ((this.getBalance() - amount) < 0) {
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	public boolean deposit(float amount) {
		this.setBalance(this.getBalance() + amount);
		return true;
	}
	
	public boolean transfer(float amount, Account destination) {
		boolean withDrawResult = this.withDraw(amount);
		boolean depositResult = destination.deposit(amount);
		if (withDrawResult && depositResult) {
			return true;
		}
		if (withDrawResult) {
			this.deposit(amount);
		}
		if (depositResult) {
			this.withDraw(amount);
		}
		return false;
	}

	public float getBalance() {
		return balance;
	}

	private void setBalance(float balance) {
		this.balance = balance;
	}
}
