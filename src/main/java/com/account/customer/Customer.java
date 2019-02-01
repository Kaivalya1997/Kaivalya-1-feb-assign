package com.account.customer;

import com.account.accounts.IAccount;
import com.account.stocks.IStocks;

public class Customer {
       private IAccount account;
       private IStocks stock;
       private String name;
       
	public IAccount getAccount() {
		return account;
	}
	public void setAccount(IAccount account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer name= "+name+ ", Account balance: "+account.getBalance();
	}
	public IStocks getStock() {
		return stock;
	}
	public void setStock(IStocks stock) {
		this.stock = stock;
	}
	
	public void CreditStock(IStocks stock) {
		int Currbal=account.getBalance();
		account.setBalance(Currbal+stock.getPrice());
	}
	
       
}