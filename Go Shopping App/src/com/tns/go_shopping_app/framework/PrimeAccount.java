package com.tns.go_shopping_app.framework;

public abstract class PrimeAccount extends ShopAccount {//abstract sub class primeaccount of super abstract class shop account
	
	private static boolean IsPrime;
	private static final float Deliverycharges = 0;
	
	public PrimeAccount (int AccNo, String AccName , float charges, boolean IsPrime)
	{
		super(AccNo, AccName, charges);//defining constructor
		PrimeAccount.IsPrime = IsPrime;
		
	}
	
	public static boolean getIsPrime()
	{
		return IsPrime;
		
	}
	public static float getDeliverycharges()
	{
		return Deliverycharges;
		
	}
	@Override
	public abstract void bookProduct(float charges);
	
	@Override
	public String toString()
	{
		return "PrimeAccount [ toString()="+ super.toString()+ getDeliverycharges() +"]";
		
	}
	

}
