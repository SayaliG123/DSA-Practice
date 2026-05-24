package Backtracking;
//here we are finding the path of how many ways to go at 1,1 in matrix 
//only down and right is allowed
import java.util.ArrayList;

public class Mazepath {

	public static void main(String[] args) {
		pathdia("",3,3);
		System.out.println(pathret("",3,3));

	}
	static void path(String p,int r,int c)
	{
		if(r==1 && c==1)
		{
			System.out.println(p);
			return ;
		}
		if(r>1)
		{
			path(p+'D',r-1,c);
		}
		if(c>1)
		{
			path(p+'R',r,c-1);
		}
	}
	static ArrayList<String> pathret(String p,int r,int c)
	{
		if( r==1 && c==1)
		{
			ArrayList<String>list=new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String>list=new ArrayList<>();
		if(r>1)
		{
			list.addAll(pathret(p+'D',r-1,c));
		}
		if(c>1)
		{
			list.addAll(pathret(p+'R',r,c-1));
		}
		return list;
		
	}
	
	
	//same que but digonally is allowed
	static void pathdia(String p,int r,int c)
	{
		if(r==1 && c==1)
		{
			System.out.println(p);
			return ;
		}
		if(r>1 && c>1)
		{
			pathdia(p+'D',r-1,c-1);
		}
		if(r>1)
		{
			pathdia(p+'V',r-1,c);
		}
		if(c>1)
		{
			pathdia(p+'H',r,c-1);
		}
	}
	static ArrayList<String> pathretdia(String p,int r,int c)
	{
		if( r==1 && c==1)
		{
			ArrayList<String>list=new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String>list=new ArrayList<>();
		if(r>1 && c>1)
		{
			list.addAll(pathretdia(p+'D',r-1,c-1));
		}
		if(r>1)
		{
			list.addAll(pathretdia(p+'D',r-1,c));
		}
		if(c>1)
		{
			list.addAll(pathretdia(p+'R',r,c-1));
		}
		return list;
		
	}

}
