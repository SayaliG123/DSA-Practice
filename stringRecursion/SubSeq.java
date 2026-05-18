package stringRecursion;
//for finding all subsequence of array

public class SubSeq {

	public static void main(String[] args) {
		subseq(" ","abc");

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

}
