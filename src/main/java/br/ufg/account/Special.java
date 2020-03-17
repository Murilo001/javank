package br.ufg.account;

public class Special implements Account {

	private float limit;
	
	private int number;
	
	private int digit;
	
	private int agency;
	
	private int payDay;
	
	public boolean withDraw(float amount) {
		if ((this.getLimit() - amount) < 0) {
			return false;
		}
		this.setLimit(this.getLimit() - amount);
		return true;
	}
	
	public boolean deposit(float amount) {
		this.setLimit(this.getLimit() + amount);
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

	public float getLimit() {
		return limit;
	}

	private void setLimit(float limit) {
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

	public float getBalance() {
		return this.getLimit();
	}

}
