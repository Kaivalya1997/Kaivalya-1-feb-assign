package com.account.stocks;

public class Liquid implements IStocks{
    
	private int price;
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public void setPrice(int price) {
      		this.price=price;
	}

}
