package problem20;

import java.util.ArrayList;

public class Solution {
	public static void main(String [] args)
	{
		int [][] matrix=new int [4][4];
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				matrix[i][j]=i*4+j+1;
		 ArrayList<Integer> al =printMatrix(matrix);
		 System.out.println(al);
	}

	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int columns=matrix.length;
		int rows=matrix[0].length;
		for(int start=0;columns>start*2&&rows>start*2;start++)
		printCricle(matrix,columns,rows,start,al);
		
		return al;
	    }
	public static void printCricle(int [][] matrix,int columns,int rows,int start,ArrayList<Integer> al)
	{
		int endx=columns-1-start;
		int endy=rows-1-start;
		for(int i=start;i<=endx;i++)
			al.add(matrix[start][i]);
		if(start<endy)
		for(int i=start+1;i<=endy;i++)
			al.add(matrix[i][endx]);
		if(start<endx&&start<endy)
		for(int i=endx-1;i>=start;i--)
			al.add(matrix[endy][i]);
		if(start<endx&&start<endy-1)
		for(int i=endy-1;i>=start+1;i--)
			al.add(matrix[i][start]);
	}
}
