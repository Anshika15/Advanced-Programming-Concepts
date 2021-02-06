int evenDigits(int n)
{
  if(n == 0)
    return 0;
  else 
  {
    if(n%2 == 0)
    	return n%10 + 10*evenDigits(n/10);
    else
      return evenDigits(n/10);
  }
    
  /*int res = 0;
  while(n != 0)
  {
    int temp = n%10;
    if(temp%2 == 0)
    {
      res = res*10 + temp;
    }
    n /= 10;
  }
  return res;*/
}
