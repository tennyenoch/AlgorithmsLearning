package com.validations;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		int k=0;
		int l=0;
		int m=0;
		int spiral[][] = new int[n][n];
		for (int i=1;i<n+1;i++)
		{
			m=m+i;
			for(int j=0;j<n;j++)
			{
				l=j;
				k=m+l;
				System.out.print(k);
			}
			System.out.println("\n");
		}
	}

}
