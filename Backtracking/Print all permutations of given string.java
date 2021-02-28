class Solve
{
  	// The first argument is the string. You need to save all permutations in the ArrayList passed as 4th argument named perm add() method.
	// Dont print the permutations as they will be printed after needed processing (sorting in lexicographical order) at back end.
    void permute(String str, int l, int r, ArrayList<String> perm) 
	{ 
		if(l == r)
          perm.add(str);
      for(int i = l; i <= r; i++)
      {
        str = swap(str, l, i);
        permute(str, l+1, r, perm);
        str = swap(str, l, i);
      }
	}
  String swap(String str, int l, int r)
  {
    char[] arr = str.toCharArray();
    char temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    return String.valueOf(arr);
  }
  
}
