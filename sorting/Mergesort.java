package sorting;

import java.util.Arrays;
//this is code for merger sort

public class Mergesort {

	public static void main(String[] args) {
		int [] arr= {1,3,2,5,4};
		
		System.out.println(Arrays.toString(mergesort(arr)));

	}
	public static int [] mergesort(int [] arr)
	{
		if(arr.length-1==0)
		{
			return arr;
		}
		int mid=arr.length/2;
		//here we are further dividing that array
		
		int [] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
		int [] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));
		
		//here we are merging that sorted array
		return merge(left,right);
	}
	public static int [] merge(int [] first, int[] second)
	{
		int[] mix=new int [first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length && j<second.length)
		{
			if(first[i]<second[j])
			{
				mix[k]=first[i];
				i++;
			}
			else
			{
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		
		//when any one array has finished 
		//we have to put all elements of remaining in mix
		while(i<first.length)
		{
			mix[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length)
		{
			mix[k]=second[j];
			k++;
			j++;
		}
		return mix;
	}

}
