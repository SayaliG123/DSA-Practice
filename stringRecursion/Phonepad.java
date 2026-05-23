package stringRecursion;
import java.util.ArrayList;
//here we are creating a phone pad if we type 12 what it will print
//old buttons phone
//use this logic for leetcode 17

public class Phonepad {

	public static void main(String[] args) {
		pad("","12");
		System.out.println(pad2("","12"));

	}
	static void pad(String p, String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		int digit=up.charAt(0)-'0';//here we are converting a character into a digit
		
		for(int i=(digit-1)*3;i<digit*3;i++)
		{
			char ch=(char)('a'+i);
			pad(p+ch,up.substring(1));
		}
	}
	static ArrayList<String> pad2(String p,String up)
	{
		if(up.isEmpty())
		{
			ArrayList<String>list=new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit=up.charAt(0)-'0';
		ArrayList<String>list=new ArrayList<>();
		
		for(int i=(digit-1)*3;i<digit*3;i++)
		{
			char ch=(char)('a'+i);
			list.addAll(pad2(p+ch,up.substring(1)));
		}
		return list;
		
	}

}

