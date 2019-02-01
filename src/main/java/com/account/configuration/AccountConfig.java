package com.account.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.account.accounts.CorporateAccount;
import com.account.accounts.IAccount;
import com.account.accounts.IndividualAccount;
import com.account.accounts.PensionAccount;
import com.account.stocks.IStocks;
import com.account.stocks.Liquid;
import com.account.stocks.Mutual;

@Configuration
public class AccountConfig {
	
	@Bean(name="liquidstock")
	public IStocks stock() {
		return new Liquid();
	}
	@Bean(name="mutualstock")
	public IStocks stock1() {
		return new Mutual();
	}
	@Bean(name="pension")
	public IAccount stock2() {
		return new PensionAccount();
	}
	@Bean(name="corporate")
	public IAccount stock3() {
		return new CorporateAccount();
	}
	@Bean(name="individual")
	public IAccount stock4() {
		return new IndividualAccount();
	}
}
