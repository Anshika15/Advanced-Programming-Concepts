class Result
{
  static void makeAllZero(int mat[][], int r, int c)
  {
	boolean row[] = new boolean[r];
    boolean col[] = new boolean[c];
    for(int i = 0; i < r; i++)
      row[i] = false;
    for(int i = 0; i < c; i++)
      col[i] = false;
      
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        if(mat[i][j] == 0)
        {
          row[i] = true;
          col[j] = true;
        }
      }
    }
    
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        if(row[i] == true || col[j] ==true)
        {
          mat[i][j] = 0;
        }
      }
    }
  }
}
