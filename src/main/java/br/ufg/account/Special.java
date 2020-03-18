package br.ufg.account;

public class Special implements Account {

	private double limit;
	
	private int number;
	
	private int digit;
	
	private int agency;
	
	private int payDay;
	
	public boolean withDraw(double amount) {
		if ((this.getLimit() - amount) < 0) {
			return false;
		}
		this.setLimit(this.getLimit() - amount);
		return true;
	}
	
	public boolean deposit(double amount) {
		this.setLimit(this.getLimit() + amount);
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

	public double getLimit() {
		return this.limit;
	}

	private void setLimit(double limit) {
		this.limit = limit;
	}
	
	public int getNumber() {
		return this.number;
	}

	public int getDigit() {
		return this.digit;
	}

	public int getAgency() {
		return this.agency;
	}

	public double getBalance() {
		return this.getLimit();
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

}
