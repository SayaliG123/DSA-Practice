package basic;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner (System.in);
		System.out.println("enter opertaor");
		char op=input.next().trim().charAt(0);
		
		if(op=='+'|| op=='-'|| op=='*' || op=='/')
		{
			System.out.println("enter numbers");
			int num1=input.nextInt();
			int num2=input.nextInt();
			if(op=='+')
			{
				System.out.println(num1+"+"+num2 +"="+ (num1+num2));
			}
			if(op=='-')
			{
				System.out.println(num1 +"-"+num2 +"="+ (num1-num2));
			}
			if(op=='*')
			{
				System.out.println(num1 +"*"+num2 +"="+ (num1*num2));
			}
			if(op=='/')
			{
				System.out.println(num1 +"/"+num2 +"="+ (num1/num2));
			}
			
		}

	}

}
