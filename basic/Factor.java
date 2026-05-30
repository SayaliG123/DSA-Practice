package basic;

public class Factor {

	public static void main(String[] args) {
		factor(40);

	}
	public static void factor(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(n/i==i)
				{
					System.out.println(i);
				}
				else
				{
					System.out.println(i+" "+n/i);
				}
			}
		}
	}

}
