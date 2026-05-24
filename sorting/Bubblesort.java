package sorting;
//this is simple java code of bubble sort

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int []arr= {4,6,3,2,8};
		System.out.println(Arrays.toString(arr));
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static void bubblesort(int [] arr)
	{
		int n=arr.length;
		boolean swapped= false;//here we are setting this variable as false
		for(int j=0;j<n;j++)
		{
			for(int i=j;i<n-1;i++)
				{
					if(arr[i]>arr[i+1])
					{
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
						swapped=true;//here we mark it true if it gets swapped 
						
					}
				}
		}
		if(swapped==false)
		{
			return;//so that if array is already sorted then it will only run one loop
			//and will return so space and time complexity is reduced
		}
	}

}
