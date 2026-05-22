package stringRecursion;
//here we are finding how many ways we can arrange abc

public class Permutation {

	public static void main(String[] args) {
		
		permutation("","abc");
	}
	static void permutation(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		
		for(int i=0;i<=p.length();i++)//here we are iterating by length of processed string
		{
			String f=p.substring(0,i);//fist and second 2 substrings we have created 
			String s=p.substring(i,p.length());
			//between these 2 we will add our char
			permutation(f+ch+s,up.substring(1));
		}
			
	}

}
/*           a
 ba                   ab
cba,bca,bac        cab,acb,abc
*/