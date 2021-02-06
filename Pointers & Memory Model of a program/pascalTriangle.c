/*
 * Complete the function below.
 */
void pascalTriangle(int k) 
{
	for(int i = 0; i < k; i++)
    {
      for(int j = 0; j <= i; j++)
      {
        int n = fact(i)/(fact(j) * fact(i-j));
        if(i != j)
        {
          printf("%d",n);
          printf("*");
        }
        else
        {
          printf("%d",n);
        }
      }
      printf("\n");
    }
}

int fact(int n)
{
  if(n == 0 || n == 1)
    return 1;
  else
  {
    int f = 1;
    for (int c = 1; c <= n; c++)
    	f = f * c;
    return f;
  }
}
