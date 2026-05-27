package sorting;

import java.util.Arrays;

public class Cyclicsort {

	public static void main(String[] args) {
		int [] arr= {2,4,5,1,3};
		cyclicsort(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	static void cyclicsort(int arr[])
	{
		int i=0;
		int n=arr.length-1;
		while(i<=n)
		{
			
			int correct_in=arr[i]-1;
			if(arr[i]!=arr[correct_in] )
			{
				int temp=arr[i];
				arr[i]=arr[correct_in];
				arr[correct_in]=temp;
			}
			else
			{
				i++;
			}
			
		}
	}
}
	
//i= 0  1  2  3
//a= 1  2  3  4
