int countWords(char str[]) 
{
  int i = 0, words = 0;
  int state = 0;
  while(str[i] != '\0')
  {
    if(str[i] == '\n' || str[i] == '\t' || str[i] == ' ')
      state = 0;
    else if(state == 0)
    {
      words++;
      state = 1;
    }
    ++i;
  }
  return words;
}
