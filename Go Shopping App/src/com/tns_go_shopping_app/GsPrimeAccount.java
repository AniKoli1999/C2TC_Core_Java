package com.tns_go_shopping_app;
import com.tns.go_shopping_app.framework.NoramalAccount;
import com.tns.go_shopping_app.framework.PrimeAccount;
import com.tns.go_shopping_app.framework.ShopAccount;

public class GsPrimeAccount extends PrimeAccount{
	
	public GsPrimeAccount(int AccNo, String AccName, float charges, boolean IsPrime) {
		super(AccNo, AccName, charges, IsPrime);
	GsPrimeAccount.setCharges(charges);
		// TODO Auto-generated constructor stub
	}

	
 @Override
 public void bookProduct(float charges)
 {
	 System.out.println("Account No:" + NoramalAccount.getDeliverycharges()+"\n"
				+"Account Holder name :"+NoramalAccount.getDeliverycharges()+"\n"
				+"delivery charges:"+NoramalAccount.getDeliverycharges()+"\n"
				+"Total charges:"+charges+"\n");
 }
 
 public static float getCharges()
 {
	 return GsPrimeAccount.getCharges();
 }
 @Override
 public void items(float items_id) {
 }
 
 @Override
 public String toString()
 {
	 return "GSPrimeAccount [toString()="+ super.toString()+",getCharges()=" +getCharges()+"]";
 }
}
