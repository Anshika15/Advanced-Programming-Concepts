void partitionArray(int arr[], int n, int x)
{
  int i, j, temp;
  i = 0;
  j = n-1;
  
  while (i < j)
  {
    while (i < j && arr[i] <=x)
       i++;
    while (i < j && arr[j] > x)
       j--;
    
    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
	
    i++;
    j--;
  }  
}
