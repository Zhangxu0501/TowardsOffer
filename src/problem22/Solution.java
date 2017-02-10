package problem22;

import java.util.Stack;

public class Solution {
	public static void main(String [] args)
	{
		int [] a={1,2,3,4,5};
		int [] b ={4,5,3,1,1};
		boolean w=IsPopOrder(a,b);
		System.out.println(w);
	}
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	      
	      if(pushA==null||pushA.length==0||popA.length==0||pushA.length!=popA.length)
	    	  return false;
	 
	      Stack s = new Stack();
	      int i=0;
	      int j=0;
	      
	      while(i<pushA.length)
	      {
	    	  s.push(pushA[i++]);
	    	  while((int)s.peek()==popA[j])
	    	  {
	    		  s.pop();
	    	  	  j++;
	    	  	  if(s.isEmpty()&&j==pushA.length)
	    	  		  return true;
	    	  	  if(s.isEmpty())
	    	  		  break;
	    	  }
	      }
		return false;
    }
}
