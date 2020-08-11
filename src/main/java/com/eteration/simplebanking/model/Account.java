package com.eteration.simplebanking.model;


// This class is a place holder you can change the complete implementation

public class Account {
	public  java.lang.String owner;
	public String accountNumber;
	public double balance;
	public Transaction transactions;
	public Account(String owner, String accountNumber) {
		this.owner=owner;
		this.accountNumber=accountNumber;
	}

	public void post(Transaction tr) {
		
		
	}
	
	public void credit(double money) {
		//add money
		
	}
	public void debit(double money) {
		//remove money
		
	}

	public Object getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getTransactions() {
		// TODO Auto-generated method stub
		return null;
	}
}
