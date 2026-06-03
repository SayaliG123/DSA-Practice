package basic;
import java.util.Scanner;
//Fibonacci without recursion

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		int n=input.nextInt();
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
