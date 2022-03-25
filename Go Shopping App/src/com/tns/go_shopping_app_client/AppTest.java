package com.tns.go_shopping_app_client;
import com.tns.go_shopping_app.framework.*;
import com.tns_go_shopping_app.GsNormalAccount;
import com.tns_go_shopping_app.GsPrimeAccount;
import com.tns_go_shopping_app.GsShopFactory;
import com.tns.go_shopping_app.*;
public class AppTest {
	
	public static void main(String[]args) {
		
	
	@SuppressWarnings("unused")
	
	
	PrimeAccount primeAccountObj = new GsPrimeAccount(1609, "Aniket Koli",(float) 0.0, true);
	
	NoramalAccount noramalAccountObj = new GsNormalAccount(3588,"Ak Koli", 0, 0);
	
	System.out.println("...Invoking the bookproduct of class GSPrime Account..");
	primeAccountObj.bookProduct(0);
	
	System.out.println("...Invoking the bookproduct of class Noarmal Account..");
	noramalAccountObj.bookProduct(0);
	
	System.out.println(primeAccountObj+"\n");
	System.out.println(noramalAccountObj+"\n");
	
	}
}
