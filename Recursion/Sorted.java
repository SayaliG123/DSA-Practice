package Recursion;
//it just tells that the array is sorted or not

public class Sorted {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int [] arr2= {3,5,2,1,4};
		System.out.println(sorted(arr,0));
		System.out.println(sorted(arr2,0));
		
		

	}
	public static boolean sorted(int [] arr,int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		return arr[index]<arr[index+1] && sorted(arr,index+1);
	}

}
