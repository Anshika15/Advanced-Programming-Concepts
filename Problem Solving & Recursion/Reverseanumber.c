#include <stdio.h>
/* Include other headers as needed */
int main()
{
  int n;
  scanf("%d",&n);
  int res = 0;
  while(n != 0)
  {
    res = res*10 + n%10;
    n /= 10;
  }
printf("%d\n",res);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
