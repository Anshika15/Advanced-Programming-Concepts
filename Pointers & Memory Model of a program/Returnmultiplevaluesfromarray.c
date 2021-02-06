/* use the array a and store the minimum, maximum and sum of array elements in respective pointer variables.
As these are used in main functions, so just store the values in them. */

void multiReturnArray(int *a, int size, int *min, int *max, int *sum)
{
  *min = 10000;
  *max = -1000000;
  *sum = 0;
  for(int i = 0; i < size; i++)
  {
    *sum += a[i];
    if(a[i] < *min)
      *min = a[i];
    if(a[i] > *max)
      *max = a[i];
  }
}
