package br.ufg.account;

public class Saving implements Account {

	private double balance;
	
	private double interestPercent;
	
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
	
	public boolean withDraw(double amount) {
		if ((this.getBalance() - amount) < 0) {
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	public boolean deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
		return true;
	}
	
	public boolean transfer(double amount, Account destination) {
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

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public double getInterestPercent() {
		return interestPercent;
	}

	public void setInterestPercent(double interestPercent) {
		this.interestPercent = interestPercent;
	}
}
