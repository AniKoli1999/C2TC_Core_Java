package javaTutorial;

public class ReturnValue {
	//function with return value

		public static void main(String[]args) {
			ReturnValue obj = new ReturnValue();//making new object of test project
			int x=10;
			int y=20;
			int get_result=obj.add(x,y);
			System.out.print(get_result);
		}
	public int add(int num1, int num2) {
		int result = num1+num2;
		return result;
	}
	}
