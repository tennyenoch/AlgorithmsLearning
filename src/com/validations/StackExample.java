package com.validations;

import java.util.Stack;
import java.util.StringTokenizer;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackExample obj = new StackExample();
		int result1 = 0;
		
		result1 = obj.solution("13 DUP 4 POP 5 DUP DUP -");
		System.out.println(result1);
	}

	public int solution(String S)
	{
		
		try {
			int result = 0;
			if (S.length() < 0)
				return -1;
			Stack<String> stack = new Stack<>();
			
			StringTokenizer strToken = new StringTokenizer(S, " ");
			while (strToken.hasMoreElements())
			{
				System.out.println("inside");
				String strTok = strToken.nextToken();

				if (isNumeric(strTok))
				{
					stack.push(strTok);
					result=Integer.parseInt(strTok);
					System.out.println("numberic -->"+strTok);
				}
				switch(strTok)
				{
				case "DUP":
					String top = stack.pop();
					stack.push(top);
					stack.push(top);
				//System.out.println(stack.elements());
					result=Integer.parseInt(top);
					break;
				case "POP":
					top = stack.pop();
					result=Integer.parseInt(top);
					break;
				case 
				"+":
					
					String top1 = stack.pop();
					String top2 = stack.pop();
					result = Integer.parseInt(top1)+Integer.parseInt(top2);
					System.out.println(" +   >"+result);
					stack.push(result+""); 
					break;
				case "-":
					String top3=stack.pop();
					String top4 = stack.pop();
					result=Integer.parseInt(top3)-Integer.parseInt(top4);
					System.out.println("-   >"+result);
					stack.push(result+""); 	
					break;
				}
				System.out.println(result);
			}
			return result;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return -1;
		}
	}
	
	public static boolean isNumeric(String s1)
	{
		try {
			Double.parseDouble(s1);
			return true;	
		}
		catch (NumberFormatException E)
		{
			return false;
			
		}
	}
}
