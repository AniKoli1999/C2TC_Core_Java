package javaTutorial;

public class Loop {
	public static void main(String[] args) {
	/*	int x = 1;
		while(x<=5) {
			System.out.println(x);
			x++;
		for(int i=0 ; i<=30 ;i=i+3) {
			System.out.println(i);
		}*/
		int n=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}


