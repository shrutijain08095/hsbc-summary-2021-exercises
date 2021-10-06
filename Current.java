package com.demo.beans;

public class Current extends Account{
	public Current(int accountNumber, float balance, int ifsc) {
		super(accountNumber,balance,ifsc);
		
	}
	public Current() {
		super();
	}
	
	String nomineeName;
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	
	void testAccount() {
		System.out.println("In class Current");
	}
	
	@Override
	public String toString() {
		return "Current [nomineeName=" + nomineeName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", ifsc=" + ifsc + ", getNomineeName()=" + getNomineeName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", getIfsc()=" + getIfsc() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	


}
