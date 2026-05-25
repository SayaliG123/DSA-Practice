package Backtracking;

import java.util.Arrays;

//here we are allowing all paths that left,right,up,down

public class Allpath {

	public static void main(String[] args) {
		boolean[][] matrix = {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		int [][]path=new int [matrix.length][matrix[0].length];
		//pathall("",matrix,0,0);
		pathallprint("",matrix,0,0,path,1);
	}
	static void pathall(String p, boolean [][] matrix,int r,int c)
	{
		if(r==matrix.length-1 && c==matrix[0].length-1)
		{
			System.out.println(p);
			return ;
		}
		if(!matrix[r][c])
		{
			return;
			
		}
		matrix[r][c]=false;//here we are marking visited
		if(r<matrix.length-1)
		{
			pathall(p+'D',matrix,r+1,c);
		}
		if(c<matrix.length-1)
		{
			pathall(p+'R',matrix,r,c+1);
		}
		//here all function call will be over 
		//so we need to mark them again as unvisited
		matrix[r][c]=true;
	}
	
	
	//here we are printing the matrix path
	static void pathallprint(String p, boolean [][] matrix,int r,int c,int [][] path,int step)
	{
		if(r==matrix.length-1 && c==matrix[0].length-1)
		{
			path[r][c]=step;//this is for last call
			for(int[] arr:path)
			{
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return ;
		}
		if(!matrix[r][c])
		{
			return;
			
		}
		matrix[r][c]=false;//here we are marking visited
		path[r][c]=step;//this is for every call destination step must be stored before printing.
		if(r<matrix.length-1)
		{
			pathallprint(p+'D',matrix,r+1,c,path, step+1);
		}
		if(c<matrix.length-1)
		{
			pathallprint(p+'R',matrix,r,c+1,path, step+1);
		}
		//here all function call will be over 
		//so we need to mark them again as unvisited
		matrix[r][c]=true;
		//here we are again making that path numberd as 0
		path[r][c]=0;
		
	}
	

}
