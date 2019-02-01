package com.account.accounts;

public class CorporateAccount implements IAccount{
private int balance;
    
	@Override
	public int getBalance() {
		return balance;
	}

	@Override
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
