package Backtracking;
//resolve
//here we are placing the  N queens on nXn table where that cannot cancel each other

public class NQueens {

	public static void main(String[] args) {
		int n=4;
		boolean [][] board=new boolean[n][n];
		System.out.println(queens(board,0));
		

	}
	public static int queens(boolean [][] board,int row)
	{
		if(row==board.length)//here we are checking that if roe becomes equal to length
							 //we need to stop there
		{
			display(board);
			System.out.println();
			return 1;
		}
		
		int count=0;
		//here we are placing the queen if it is safe
		for(int col=0;col<board.length;col++)
		{
			if(isSafe(board,row,col))
			{
				board[row][col]=true;
				count+=(queens(board,row+1));
				board[row][col]=false;
			}
		}
		return count;
		
		
	}
	//here we are checking that placement of queen is safe or not
	public static boolean isSafe(boolean[][] board,int row,int col)
	{
		//for vertical
		for(int i=0;i<row;i++)
		{
			if(board[i][col])
			{
				return false;
			}
		}
		
		//for left diagonal
		int maxleft=Math.min(row,col);
		for(int i=1;i<=maxleft;i++)
		{
			if(board[row-i][col-i])
			{
				return false;
			}
		}
		
		//for right diagonal
		int maxright=Math.min(row,board.length-col-1);
		for(int i=1;i<=maxright;i++)  //here column size is different 
		{
			if(board[row-i][col+i])
			{
				return false;
			}
		}
		return true;
		
	}
	public static void display(boolean[] [] board)
	{
		for(boolean[] row :board)
		{
			for(boolean element: row)
			{
				if(element)
				{
					System.out.print("Q");
				}
				else
				{
					System.out.print("X");
				}
				
			}
			System.out.println();
		}
	}

}
