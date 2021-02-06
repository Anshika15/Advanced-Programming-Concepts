#include <stdio.h>
/* Include other headers as needed */
int main()
{
int t;
  scanf("%d",&t);
  for(int i = 0; i < t; i++)
  {
  int n;
  scanf("%d", &n);
  int count = 0;
  while(n != 0)
  {
    count += n%10;
    n = n/10;
  }
  printf("%d\n", count);
  }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
