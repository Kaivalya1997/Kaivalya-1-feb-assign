package com.account.stocks;

public class Mutual implements IStocks {
    
	private int price;
	
	@Override
	public void setPrice(int price) {
         this.price=price;		
	}
	@Override
	public int getPrice() {
		return price;
	}

}
