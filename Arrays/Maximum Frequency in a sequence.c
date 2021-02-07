#include <stdio.h>
/* Include other headers as needed */
int main()
{
  int t;
  scanf("%d",&t);
  while(t-- > 0)
  {
  	int n;
  	scanf("%d", &n);
	int arr[n];
    int res[10001]={0};
  	for(int i = 0; i < n; i++)
    {
      scanf("%d",&arr[i]);
      res[arr[i]]++;
    }
  	
  	int frequency = 0;
  	int num = 1000;
  	for(int i = 0; i < 10001; i++)
  	{
    	if(res[i] > frequency)
        {
          num = i;
          frequency = res[i];
        }
  	}
  	printf("%d\n", num);
  }
  

  
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
