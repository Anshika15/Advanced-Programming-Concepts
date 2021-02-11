/* R,C denotes actual screen size, x,y are the co-ordinates of the pixel and newC is the new color value */
class Result
{
  static void floodFill(int screen[][], int R, int C, int x, int y, int newC)
  {
	if(screen[x][y] == newC)
      return;
    int oldC = screen[x][y];
    dfs(screen, R, C, x, y, newC, oldC);
  }
  
  static void dfs(int[][] screen, int r, int c, int x, int y, int newC, int oldC)
  {
    if(x < 0 || x >= r || y < 0 || y >= c)
      return;
    if(screen[x][y] != oldC)
      return;
    screen[x][y] = newC;
    dfs(screen, r, c, x+1, y, newC, oldC);
    dfs(screen, r, c, x-1, y, newC, oldC);
    dfs(screen, r, c, x, y+1, newC, oldC);
    dfs(screen, r, c, x, y-1, newC, oldC);
  }
}
