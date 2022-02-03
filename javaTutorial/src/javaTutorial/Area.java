package javaTutorial;
import java.util.Scanner;
public class Area {

	Scanner scan = new Scanner(System.in);
	float radius =0;
	float height =0;
	float length =0;

	public void get_details(){
		System.out.println("Enter radius : ");
		radius = scan.nextFloat();
		
		System.out.println("Enter height : ");
		height =scan.nextFloat();
		
		System.out.println("Enter length : ");
		length = scan.nextFloat();
		
	}
	public void show_details() {
		float area;
		final float PI =3.14159f;
	    area = PI*radius*radius;
		float area1;
		area1 =(length*height)/2;
		float area2;
		area2 = length*height;
		
		System.out.println("Area of circle is :"+ area);
		System.out.println("Area of Triangle is:"+ area1);
		System.out.println("Area of Parallelogram is:"+ area2);
	}
	public static void main(String[] args) {

		
		Area a = new Area();
		a.get_details();
		a.show_details();

}
	
}




