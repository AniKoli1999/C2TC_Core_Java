package com.tns.go_shopping_app.framework;



public abstract class ShopFactory {

	public abstract PrimeAccount getNewPrimeAccount (int AccNo, String AccName, float charges , boolean IsPrime);
	
	public abstract NoramalAccount getNewNoramalAccount (int AccNo, String AccName, float Deliverycharges);

	public PrimeAccount getNewPrimeaccount(int AccNo, String AccName, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

}
