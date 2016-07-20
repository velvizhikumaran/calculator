# calculator
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c = sc.next().charAt(0);
		int i=sc.nextInt();
		int j=sc.nextInt();
		double ans=0;
			switch (c)
			{ 
			case '+': 
				 ans= i+j;
				break;
			case '*':
				 ans=i*j;
				 break;
			case '/':
				ans=i/j;
				break;
			case '-':
				ans=i-j;
				break;
			
			}
		System.out.println(ans);
	}

}
