package com.validations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Addable{  
    int add(int a,int b);  
    //String add (String a, String b);
    
}  

interface findSubtract{
	int difference(int a, int b);
}



public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<String> lst = new ArrayList<String>();
 lst.add("Tenny");
 lst.add("Enoch");
 lst.add("Tim");
 lst.add("Tom");
	
	Iterator<String> itr = lst.iterator();
	while (itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	for (String i : lst)
	{
		System.out.println(i);
	}
	
	findSubtract sub1 = (a, b1)->(
			   a-b1	
			);
			
	System.out.println(sub1.difference(20, 12));
			
	
	lst.forEach(System.out::println);

	   Addable ad1 = (a,b)->(
			    a+b
			   );  
       System.out.println(ad1.add(10,20));  
	
     List<String> tst = new ArrayList<String>();  
     lst.forEach(
    		 (n)->
    		 {
    			 tst.add(n);
    			 System.out.println("TT");
    		 }
     );
     tst.forEach(System.out::println);
     
     
     List<String> lstDept = new ArrayList<>();
     lstDept.add("Science");
     lstDept.add("Maths");
     
     lstDept.forEach(
    		 (n)->
    		 {
    			 System.out.println(n);
    		 }
    		 );
	}
	
	private void comparatorExJAva7()
	{
		
	}
	
	
}


