//child class
package javaTutorial;

public class Car extends Vehicle{
	
	String color = "blue";
	int tyres = 4;
	
	public void show_car_details() {
		System.out.println("I am a Car");
		System.out.println("Colour for car is :" + color);
		System.out.println("No. of tyres :" + tyres);
	}


public static void main(String[] args) {
	
	Car c = new Car();// making object of child class
	//c.show_car_details();

	c.show_vehicle_details();//inherit in child classs
		}

}

