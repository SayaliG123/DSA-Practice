package Recursion;
//this is simple code to find the sum of digits in a given number

public class Digitsum {

	public static void main(String[] args) {
		System.out.println(sum(2345));

	}
	public static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return (n%10)+sum(n/10);
		
		
	}

}
