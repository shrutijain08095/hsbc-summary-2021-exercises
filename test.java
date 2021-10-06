package com.demo.test;
import java.util.Scanner;

import com.demo.beans.*;
public class test {
	static void main (String args[]) {
		Account a1 = new Account();
		Current b1 = new Current();
		Savings c1 = new Savings();
		System.out.println("passing A object");
		displayTest(a1); 
		System.out.println("passing B object");
		displayTest(b1); 
		System.out.println("passing C object");
		displayTest(c1); 
		
}
	
public static void displayTest(Account a) { 
	a.testAccount();
	
	Account x = a;
	x.testAccount();
	if(a instanceof Current) { 
		System.out.println("instance of B");
		Current y = (Current)a;
		y.testAccount();
	}
	if(a instanceof Savings) { 
		System.out.println("instance of C");
		Savings z = (Savings)a;
		z.testAccount();
	}
	
}
