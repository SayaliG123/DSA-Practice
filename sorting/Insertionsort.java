package sorting;
//it just a simple code of insertion sort

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		int [] arr= {3,5,1,7,2};
		System.out.println(Arrays.toString(arr));
		insertionsort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void insertionsort(int [] arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
				}
			}
		}
	}
	static void swap(int [] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
