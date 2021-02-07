int arraysEqualorNot(int size_A, int* A, int* B) {
  
  for (int i = 0; i < size_A - 1; ++i) 
  {
     for (int j = i + 1; j < size_A; ++j)
     {
       if (A[i] > A[j]) 
       {
         int a =  A[i];
         A[i] = A[j];
         A[j] = a;
        }
     }
  }
  
  for (int i = 0; i < size_A - 1; ++i) 
  {
     for (int j = i + 1; j < size_A; ++j)
     {
       if (B[i] > B[j]) 
       {
         int a =  B[i];
         B[i] = B[j];
         B[j] = a;
        }
     }
  }
  
  for(int i = 0; i < size_A; i++)
  {
    if(A[i] != B[i])
      return 0;
  }
return 1;

}
