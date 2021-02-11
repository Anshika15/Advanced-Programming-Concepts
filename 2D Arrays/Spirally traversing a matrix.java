class Result
{
  static void printSpiral(int a[][], int r, int c)
  {
	int srow = 0, erow = r, scol = 0, ecol = c;
    
  while(srow < erow && scol < ecol)
  {
    
   for(int i = scol; i < ecol; i++)
   {
     System.out.println(a[srow][i]);
   }
     srow++;
    
   for(int i = srow; i < erow; i++)
   {
     System.out.println(a[i][ecol-1]);
   }
    ecol--;
    
    if(srow < erow)
    { 
   		for(int i = ecol-1; i >= scol; i--)
   		{
     		System.out.println(a[erow-1][i]);
   		}
    erow--;
    }
    
    if(scol < ecol)
    {
   		for(int i = erow-1; i >= srow; i--)
   		{
     		System.out.println(a[i][scol]);
   		}
    scol++;
    }
  }
 }
}
