package stringRecursion;
import java.util.ArrayList;
import java.util.List;
//for finding all subset by iteration

public class Subsetbyitretion {

	public static void main(String[] args) {
		int [] arr= {1,2,3};
		List<List<Integer>> ans=subset(arr);
		for(List<Integer> list:ans)
		{
			System.out.println(list);
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

}
