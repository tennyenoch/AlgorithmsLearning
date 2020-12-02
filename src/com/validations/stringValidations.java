/**
 * 
 */
/**
 * @author tenny
 *
 */
package com.validations;

public class stringValidations{

public static void main (String args[])
{
	System.out.println("Hello");
	
	OneEditApart("cat", "dog");
	OneEditApart("cat", "cats");
	OneEditApart("cat", "cut");
	OneEditApart("cat", "cast");
	OneEditApart("cat", "at");
	OneEditApart("cat", "act");
			
	
}

private static boolean OneEditApart(String s1, String s2)
{
	char a[]=new char[s1.length()];
	char b[]=new char[s2.length()];
    int count=0;
    int intLengthOfa= 0;
    intLengthOfa = s1.length();
	for (int i=0;i<s1.length();i++)
	{
	 a[i]=s1.charAt(i);
	 //System.out.println(a[i]);
	}
	//System.out.println("first string over");
	for (int j=0;j<s2.length();j++)
	{
	 b[j]=s2.charAt(j);
	 //System.out.println(b[j]);
	}
	
	for (int i=0;i<a.length;i++)
	{
		for (int j=0;j<b.length;j++)
		{
			if (a[i] == b[j])
			count++;
		}
	}
	System.out.println("count-->"+count);
	
	if ((count == intLengthOfa) || (count+1 == intLengthOfa) 
			|| (count-1 == intLengthOfa))
	{
		System.out.println("true");
		return true;
	}
	
	else
	{
		System.out.println("false");
		return false;
	}
		
}

}