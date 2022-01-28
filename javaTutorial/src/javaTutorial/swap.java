package javaTutorial;

public class swap {
	public static void main(String[]args) {
		int a= 10;
		int b=20;
		 swap(a,b);
		
	}
public static void swap(int num1, int num2) {
	System.out.println("Values before swapping are: a:"+num1+ "b:"+num2);
	int c = num1;
	num1=num2;
	num2=c;
	System.out.println("Values after swapping are: a:"+num1+ "b:"+num2);
	
}
}
