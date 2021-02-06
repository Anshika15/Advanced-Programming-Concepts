void reverseArray(int *a, int size)
{
  int arr[size];
  int i = 0, j = size - 1;
  while(i < size && j >= 0)
  {
    arr[i] = a[j];
    i++;
    j--;
  }
  for(i = 0; i < size; i++)
    a[i] = arr[i];
}
