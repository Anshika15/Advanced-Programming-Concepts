class Result {
  static ArrayList<Integer> cutSticks(ArrayList<Integer> lengths) {
    ArrayList<Integer> count = new ArrayList<Integer>();
   
      for(int i = 0; i < lengths.size(); i++)
      {
        int min = findMin(lengths);
    	int c = 0;
        for(int j = 0; j < lengths.size(); j++)
        {
          if(lengths.get(j) != 0)
          {
            lengths.set(j, lengths.get(j) - min);
            c++;
          }   
        }
        if(c != 0)
    		count.add(c);
      }
   
    return count;
    
  }
  
  static int findMin(ArrayList<Integer> arr)
  {
    int min = Integer.MAX_VALUE;
    for (Integer i : arr) 
    {
      if(min > i && i != 0)
        min = i;
    }
    return min;
  }
}
