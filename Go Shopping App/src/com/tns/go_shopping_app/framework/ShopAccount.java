package com.tns.go_shopping_app.framework;

public abstract class  ShopAccount {
 
	private static int AccNo;
	private static String AccName;// private class varibale
	private static float charges;

	
	public ShopAccount (int AccNo, String AccName, float charges)
	{
		ShopAccount.AccNo = AccNo;
		ShopAccount.AccName = AccName;// abstract class constructor
		ShopAccount.setCharges(charges);
	}

	public abstract void bookProduct(float charges);
	
	public abstract void items(float charges);
	
	public static int get_AccNo()
	{
		return AccNo;
	}
	
	public static String getAccName()
	{
		return AccName;
	}
	
	public static float getCharge()
	{
		return getCharges();
	}
	public static void setAccName(String AccName1)
	{
		AccName = AccName1;
	}
	
	public static float getCharges()
	{
		return charges;
	}
	
	
	
	public String toString()// overrinding tp string method to print object
	{
		return "ShopAccount [AccNo=" + AccNo +", AccName="+ AccName +",charges="+ getCharges() +" ]";
	}

	public static void setCharges(float charges) {
		ShopAccount.charges = charges;
	}
	
	
	
}