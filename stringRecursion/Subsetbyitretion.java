package stringRecursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//here we are making subsets by iteration instate of recursion

public class Subsetbyitretion {

	public static void main(String[] args) {
		//int [] arr= {1,2,3};
		int []arr1= {1,2,2};
		/*List<List<Integer>> ans=subset(arr);
		for(List<Integer> list:ans)
		{
			System.out.println(list);
		}*/
		List<List<Integer>> ans1=subsetduplicate(arr1);
		for(List<Integer> list1:ans1)
		{
			System.out.println(list1);
		}
		

	}
	static List<List<Integer>> subset(int [] arr)
	{
		List<List<Integer>> outer= new ArrayList<>();
		outer.add(new ArrayList<>());//here first empty list is added
		
		for(int num : arr)
		{
			int n=outer.size();//we have to iterate by the size of outer list
			for(int i=0;i<n;i++)
			{
				List<Integer>inner=new ArrayList<>(outer.get(i));
				//here first we are getting the previous list then making changes in it
				inner.add(num);
				//the no. from array is getting added 
				outer.add(inner);
				//it is added in main outer array
			}
		}
		return outer;
	}
	static List<List<Integer>> subsetduplicate(int [] arr)
	{
		Arrays.sort(arr);
		List<List<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());
		
		int start=0;
		int end=0;
		for(int i=0;i<arr.length;i++)
		{
			//if previous of arr is equal to current then s=e+1
			if(i<0 && arr[i]==arr[i-1])
			{
				start=end+1;
				
			}
			end=outer.size();
			int n=outer.size();
			for(int j=start;j<n;j++)
			{
				List<Integer>inner=new ArrayList<>(outer.get(j));
				inner.add(arr[i]);
				outer.add(inner);
			}
		}
		return outer;
		
		
	}

}
