package basic;
import java.util.Scanner;
//here we are finding that how many times that particular
//number has arrived in given string

public class Counting_occur {

	public static void main(String[] args) {
		System.out.println("enter the string ");
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("enter a number to search");
		int a=input.nextInt();
		int count =0;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem==a)
			{
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
		

	}

}
