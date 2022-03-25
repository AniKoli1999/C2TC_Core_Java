package com.tns_go_shopping_app;
import com.tns.go_shopping_app.framework.NoramalAccount;

public class GsNormalAccount extends NoramalAccount{
	
	

	private float charges;

	public GsNormalAccount(int AccNo, String AccName, float charges, float Deliverycharges) {
		super(AccNo, AccName, charges, Deliverycharges);
		// TODO Auto-generated constructor stub
	}
	
@Override
public void bookProduct(float chrges)
{
	float charges1 = charges + NoramalAccount.getDeliverycharges();
	
	System.out.println("Account No:" + NoramalAccount.getDeliverycharges()+"\n"
			+"Account Holder name :"+NoramalAccount.getDeliverycharges()+"\n"
			+"delivery charges:"+NoramalAccount.getDeliverycharges()+"\n"
			+"Total charges:"+charges1+"\n");
}
	
@Override
public void items(float items_obj)
{
	System.out.println();
}

@Override
public String toString()
{
	return "GSNoramlAccount [toString()="+ super.toString()+",getCharges()="+getCharges()+"]";
}

}
