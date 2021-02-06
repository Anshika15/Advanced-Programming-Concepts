#include <stdio.h>
int main()
{
	int arr[] = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
  	int res[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
  	int n;
  	scanf("%d",&n);
  	int i = 0;
  	while(n != 0 && i < 9)
    {
      if(arr[i] <= n)
      {
        res[i]++;
        n = n - arr[i];
      }
      else
      {
        i++;
      }
    }
  for(int j = 0; j < 9; j++)
  {
    printf("%d ", res[j]);
  }
    return 0;
}
