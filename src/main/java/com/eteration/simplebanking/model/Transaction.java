package com.eteration.simplebanking.model;

import java.util.Date;

// This class is a place holder you can change the complete implementation
public abstract class Transaction extends Account{
	public Date date=null;
    public String toString() {
    	
    	return "";
    }
	public  Transaction() {
	}
	public  Transaction(double money) {
		
	}
	public abstract  void DepositTransaction(double money);
	public abstract  void WithdrawlTransaction(double money);
}