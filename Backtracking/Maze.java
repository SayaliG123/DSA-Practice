package Backtracking;
//we are counting how many ways to go at 1,1 in matrix 
//only down and right is allowed

public class Maze {

	public static void main(String[] args) {
		System.out.println(count(4,4));

	}
	static int count(int r,int c)
	{
		if(r==1 || c==1)
		{
			return 1;
		}
		int left=count(r-1,c);
		int right=count(r,c-1);
		return left+right;
	}

}
