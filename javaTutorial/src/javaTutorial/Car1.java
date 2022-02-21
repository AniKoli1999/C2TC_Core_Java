//inheritance with constructor child class
package javaTutorial;
import java.util.Scanner;
public class Car1 extends Vehicle1 {
	
	String color = "";
	int tyres = 0;
	
	
	public Car1(int c, float m, String col, int ty) {
		super(c,m);    // to pass in parent class 
		color = col;
		tyres = ty;
	}
	public void show_car_details() {
	
		System.out.println("Colour for car is :" + color);
		System.out.println("No. of tyres :" + tyres);
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter cost of vehicle:");
		int cost = scan.nextInt();
		
		System.out.println("Enter Mileage of vehicle:");
		float mileage = scan.nextFloat();
		
		System.out.println("Enter color of vehicle:");
		String color = scan.next();
		
		System.out.println("Enter tyres of vehicle:");
		int tyres = scan.nextInt();
		
		
		
		
		
		
		Car1 c = new Car1(cost, mileage, color, tyres);// making object of child class
		c.show_car_details();

		c.show_vehicle_details();//inherit in child classs
			}

}
