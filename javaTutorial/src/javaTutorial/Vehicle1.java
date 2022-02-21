//inheritance with constructor parent class
package javaTutorial;

public class Vehicle1 {
	
	int cost = 0;
	float mileage = 0;
	
	public Vehicle1(int c , float m) 
	{
		
		cost =c;
		mileage = m;
	}
			
	
	
	
	
	
	public void show_vehicle_details() {
		

		
		System.out.println("Cost of  Vehicle is :" + cost);
		System.out.println("mileage of Vehicle is :" + mileage);
		
	}
}




