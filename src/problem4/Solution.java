package problem4;

public class Solution {
public static String replaceSpace(StringBuffer str) {

		StringBuffer sb = new StringBuffer();
		for(int x=0;x<str.length();x++)
		{
			if(str.charAt(x)==' ')
			{
				sb.append("%20");
			}
			else
				sb.append(str.charAt(x));
		}
    	return sb.toString();
    }
	public static void main(String [] args)
	{
		
		System.out.println(replaceSpace(new StringBuffer("We Are Happy.")));
	}
}
