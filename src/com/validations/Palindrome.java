package com.validations;

public class Palindrome {

	public static void main (String args []) {
		   int r,sum=0,temp;   
		   int x=1214121;
		   temp=x;    
		   
		   while(x>0){    
		   r=x%10;  //getting remainder  
		   System.out.println("r:"+r);
		   sum=(sum*10)+r;    
		   System.out.println("sum :"+sum);
		   x=x/10;    
		  }    
		  if(temp==sum)  
		  {
		   System.out.println("Palindrome");
		    }
	else {
		System.out.println("NO");
		}
		
	}
}
