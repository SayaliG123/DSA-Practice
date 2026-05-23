package stringRecursion;
import java.util.ArrayList;
// getting specific no.from a dice 


public class Diceque {

	public static void main(String[] args) {
		dice("",4);
		System.out.println(diceret("",4));

	}
	static void dice(String p,int target)
	{
		if(target==0)
		{
			System.out.println(p);
			return;
		}
		//i should be less than target 
		for(int i=1;i<=6 && i<=target;i++)//i<6 because dice 6 faces	
		{
			dice(p+i,target-i);
		}
	}
	
	static ArrayList<String> diceret(String p,int target)
	{
		if(target==0)
		{
			ArrayList<String>list=new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list=new ArrayList<>();
		for(int i=1;i<=6 && i<=target;i++)
		{
			list.addAll(diceret(p+i,target-i));
		}
		return list;
	}

}
