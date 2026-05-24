package Backtracking;
// here we are printing a path if it has obstacle 
public class Mazeobstacle {

	public static void main(String[] args) {
		boolean[][] matrix = {
				{true,true,true},
				{true,false,true},
				{true,true,true}
		};
		path("",matrix,0,0);
		

	}
	static void path(String p, boolean [][] matrix,int r,int c)
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
		if(r<matrix.length-1)
		{
			path(p+'D',matrix,r+1,c);
		}
		if(c<matrix.length-1)
		{
			path(p+'R',matrix,r,c+1);
		}
	}
	
	
	
	
	
	

}
