// inheritance 
package javaTutorial;

public class Iphone implements Phone
{
	public void cost()
	{
		System.out.println("Cost of I phone is 1000$");
	}
	
	public void color()
	{
		System.out.println("Color of I phone is Gold");
	}
	
	public void batterylife()
	{
		System.out.println("Battery life of I phone is 20 hrs");
	}
	
	public static void main(String[]args)
	{
		Iphone ip = new Iphone();// Making Instance of iphone class
		
		ip.color();
		ip.batterylife(); // calling method
		ip.cost();
	}

}
