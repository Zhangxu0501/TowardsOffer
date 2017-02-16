package problem35;

import java.util.HashMap;

public class Solution
{
	public static void main(String[] args)
	{
		System.out.println(new Solution().FirstNotRepeatingChar("abacjsdfgkdhfsjhfdsjk"));
	}

	public int FirstNotRepeatingChar(String str) {
		  if(str==null)
			  return 0;
		  if(str.equals(""))
				  return -1;
		  char [] chars =str.toCharArray();
		  HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		  for(int x=0;x<chars.length;x++)
		  {
			  if(hs.containsKey(chars[x]))
			  {
				  int count=hs.get(chars[x]);
				  hs.remove(chars[x]);
				  count++;
				  hs.put(chars[x], count);
			  }
			  else
			  {
				  hs.put(chars[x], 1);
			  }
				 
		  }
		  
		  for(int x=0;x<chars.length;x++)
		  {
			  if(hs.get(chars[x])==1)
				  return x;
		  }
		  
	        return 0;
	    }
}
