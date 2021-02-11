import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for(int k = 0; k < t; k++)
    {
      int n = s.nextInt();
      int arr[][] = new int[n][n];
      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < n; j++)
        {
          arr[i][j] = s.nextInt();
        }
      }
      for(int i = 0; i < n/2; i++)
      {
        for(int j = i; j < n-1-i; j++)
        {
          int temp = arr[i][j];
          arr[i][j] = arr[n-1-j][i];
          arr[n-1-j][i] = arr[n-1-i][n-1-j];
          arr[n-1-i][n-1-j] = arr[j][n-1-i];
          arr[j][n-1-i] = temp;
        }
      }
      for(int i = 0; i < n; i++)
      {
        for(int j = 0; j < n; j++)
        {
          if(j != n-1)
          	System.out.print(arr[i][j] + " ");
          else
            System.out.print(arr[i][j]);
        }
        System.out.println();
      }
       System.out.println();
    }
  }
}
