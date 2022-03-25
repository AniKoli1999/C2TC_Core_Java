package com.tns.go_shopping_app.framework;

public abstract class NoramalAccount extends ShopAccount {


private static float Deliverycharges;

public NoramalAccount(int AccNo, String AccName, float charges, float Deliverycharges)
{
	super(AccNo,AccName,charges);
	NoramalAccount.Deliverycharges = Deliverycharges;
	
}
public static float getDeliverycharges()
{
	return Deliverycharges;
	
}

public abstract void bookProduct (float charges);
@Override
public String toString()
{

	return "NoramlAccount [getCharges()=" +getCharges()+"getDeliverycharges="+ getDeliverycharges()+ ",toString()="+ super.toString()+ getDeliverycharges()+"]";
}

}
