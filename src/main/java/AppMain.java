import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.account.accounts.IAccount;
import com.account.configuration.AccountConfig;
import com.account.customer.Customer;
import com.account.stocks.IStocks;

public class AppMain {
	public static void main(String[] args) {
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AccountConfig.class);
		IStocks bean1 =(IStocks) context.getBean("liquidstock");
		IStocks bean2 =(IStocks) context.getBean("mutualstock");
		IAccount bean3=(IAccount) context.getBean("pension");
		bean1.setPrice(100);
		bean2.setPrice(200);
		Customer cust=new Customer();
		cust.setName("Kaivalya");
		cust.setAccount(bean3);
		cust.CreditStock(bean1);
		System.out.println(cust);
		context.close();
	}
}
