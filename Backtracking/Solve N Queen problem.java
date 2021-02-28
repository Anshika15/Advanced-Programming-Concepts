class Result 
{
  
// Complete this function to check placing queen at board[row][col] is safe or not by checking current row, left diagonal & right diagonal.
  int isSafe(int board[][], int row, int col, int N) 
  { 
	 int i, j; 
  
        /* Check this row on left side */
        for (i = 0; i < col; i++) 
            if (board[row][i] == 1) 
                return 0; 
  
        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return 0;
  
        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--) 
            if (board[i][j] == 1) 
                return 0; 
  
        return 1;
  } 

// Complete this function to solve the problem and save the answers in sol ArrayList as required.
  boolean solveNQUtil(int board[][], int col, int N, ArrayList<ArrayList<Integer> > sol)
  { 
	if(col == N){
      addList(board, sol);
      return true;
    }
    boolean res = false;
    for(int i = 0; i < N; i++)
    {
      if(isSafe(board, i, col, N) == 1)
      {
        board[i][col] = 1;
      //  list.add(col+1);
        res = solveNQUtil(board, col+1, N, sol) || res;
        board[i][col] = 0;
      //  list.clear();
      }
    }
    return res;
  }
  
  void addList(int[][] b, ArrayList<ArrayList<Integer>> sol)
  {
    ArrayList<Integer> list = new ArrayList<>();
    int n = b.length;
    for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < n; j++)
      {
        if(b[i][j] == 1)
        {
          list.add(j);
        }
      }
    }
    sol.add(list);
  }
}
