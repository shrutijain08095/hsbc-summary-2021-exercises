package com.demo.beans;

public class Savings extends Account{
	public Savings(int accountNumber, float balance, int ifsc) {
		super(accountNumber , balance , ifsc);
		
	}
	
	public Savings() {
		super();
	}

	int dailyLimit;
	public int getDailyLimit() {
		return dailyLimit;
	}
	public void setDailyLimit(int dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	
	void testAccount() {
		System.out.println("In class Savings");
	}
	@Override
	public String toString() {
		return "Savings [dailyLimit=" + dailyLimit + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", ifsc=" + ifsc + ", getDailyLimit()=" + getDailyLimit() + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", getIfsc()=" + getIfsc() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
