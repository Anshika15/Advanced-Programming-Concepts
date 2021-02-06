void reverseArray ( int a[], int n)
{
  int temp[n];
  int i = 0, j = n-1;
  while(i < n && j >= 0)
  {
    temp[i] = a[j];
    i++;
    j--;
  }
  for(i = 0; i < n; i++)
    a[i] = temp[i];
}
