package basic;
import java.util.Scanner;
//finding alphabet is it in uppercase or not 

public class Alphabet {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the charater ");
		char ch=input.next().trim().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println("lower case");
		}
		else
		{
			System.out.println("uppercase");
		}
		
	}

}
