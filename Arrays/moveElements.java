class Result {
  static void moveElements(int arr[])
  {
    int j = 0;
    int temp;
	for(int i = 0; i < arr.length; i++)
    {
      if(arr[j] < 0)
      {
        temp = arr[j];
        for(int k = j; k < arr.length - 1; k++)
        {
          arr[k] = arr[k+1];
        }
        arr[arr.length - 1] = temp;
      }
      else j++;
    }

  }
}
