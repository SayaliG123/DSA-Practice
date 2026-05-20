package Recursion;

/*Write a Java program using recursion to count the
  number of `0`s present in a given number.*/
 


public class Count {

	public static void main(String[] args) {
		System.out.println(count(3008070));

	}
	public static int count(int n)
	{
		int c=0;
		return helper( n, c);
	}
	public static int helper(int n ,int c)
	{
		if(n==0)
		{
			return c;
		}
		if(n%10==0)
		{
			return helper(n/10,c+1); 
		}
		return helper(n/10,c);
	}
	

}
