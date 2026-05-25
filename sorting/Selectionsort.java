package sorting;
//this is simple code of selection sort
//in which we are just selecting the max element and 
//replacing it with last element 
//last element should be always at end

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int []arr= {2,4,6,8,1,3};
		System.out.println(Arrays.toString(arr));
		selectionsort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void selectionsort(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int last_in=arr.length-i-1;
			int max_in=getmax(arr,0,last_in);
			swap(arr,max_in,last_in);
		}
		
	}
	static int getmax(int []arr,int s,int e )
	{
		int max=s;
		for(int i=s;i<=e;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
			
		}
		return max;
	}
	static void swap(int []arr,int e,int last)
	{
		int temp=arr[e];
		arr[e]=arr[last];
		arr[last]=temp;
	}

}
