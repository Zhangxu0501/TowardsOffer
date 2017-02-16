package problem34;


public class Solution {
	public static void main(String [] args)
	{
		System.out.println(new Solution().GetUglyNumber_Solution(1500));
	}
	public int GetUglyNumber_Solution(int index) {
        if(index==0)
        	return 0;
        int [] ugly=new int[index];
        ugly[0]=1;
         int t2=0;
         int t3=0;
         int t5=0;
         int count=0;
         while(count<index-1)
         {
        	 count++;
        	 if(ugly[t2]*2<=ugly[t3]*3&&ugly[t2]*2<=ugly[t5]*5)
        	 {
        		 ugly[count]=ugly[t2]*2;
        	 }
        	 else  if(ugly[t3]*3<=ugly[t2]*2&&ugly[t3]*3<=ugly[t5]*5)
        	 {
        		 ugly[count]=ugly[t3]*3;
        		
        	 }
        	 else
        	 {
        		 ugly[count]=ugly[t5]*5;

        	 } 
        	 t2=update(t2,2,ugly,count);
    		 t3=update(t3,3,ugly,count);
    		 t5=update(t5,5,ugly,count);
         }
        return ugly[index-1];
    }
	public int update(int t,int type,int [] ugly,int count)
	{
		for(int x=t;x<=count;x++)
		{
			if(ugly[x]*type>ugly[count])
				return x;
		}
		return t;
	}
}
