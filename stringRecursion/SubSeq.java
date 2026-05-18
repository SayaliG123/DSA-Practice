package stringRecursion;
import java.util.ArrayList;
import java.util.Arrays;
//for finding all subsequence of array(32)

public class SubSeq {

	public static void main(String[] args) {
		subseq(" ","abc");
		System.out.println((subset(" ","abc")));

	}
	public static void subseq(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.print(p);
			return;
		}
		char ch=up.charAt(0);
		//every character has 2 options taking it or not taking
		
		subseq(ch+p,up.substring(1));//here we are taking the character
		subseq(p,up.substring(1)); //here we are ignoring the character
		
			
	}
	
	public static ArrayList<String> subset(String p,String up)
	{
		if(up.isEmpty())
		{
			ArrayList<String>list=new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
		ArrayList<String>left=subset(p+ch,up.substring(1));//left subtree
		ArrayList<String>right=subset(p,up.substring(1));//right subtree
		left.addAll(right);//combining both
		return left;
		
		
	}

}
