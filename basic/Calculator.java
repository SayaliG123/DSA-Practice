package basic;
import java.util.Scanner;
/*Write a Java program to make a simple calculator using `if` statements.
The program should take an operator (`+`, `-`, `*`, `/`, `%`)
and two numbers from the user and display the result.*/


public class Calculator {

	public static void main(String[] args) {
		
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
