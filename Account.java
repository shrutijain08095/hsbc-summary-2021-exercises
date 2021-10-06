package com.demo.beans;

public class Account {
	
	 int accountNumber;
	 float balance;
	 int ifsc;
	 
	public Account() {
		super();
	}

	public Account(int accountNumber, float balance, int ifsc) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ifsc = ifsc;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getIfsc() {
		return ifsc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	
	void testAccount() {
		System.out.println("In class Account");
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", ifsc=" + ifsc + "]";
	}
	
	
	
}
