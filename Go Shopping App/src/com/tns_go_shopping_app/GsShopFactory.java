package com.tns_go_shopping_app;
import com.tns.go_shopping_app.framework.*;


public abstract class GsShopFactory extends ShopFactory {
	
	@Override
	public PrimeAccount getNewPrimeaccount(int AccNo, String AccName, float charges, boolean isPrime)
	{
		return null;
	}
	
	public <NormalAccount> NormalAccount getNewNormalAccount(int AccNo, String AccName , float charges , float DeliveryCharges)
	{
		return null;
	}

}
