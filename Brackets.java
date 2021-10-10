package assignments;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
	
	static Boolean checkBalance(String Brackets)
	{
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<Brackets.length();i++)
		{
			char ch=Brackets.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
			{
				st.push(ch);
			}
			if(st.isEmpty())
				return false;
				char checkch;
				switch(ch)
				{
				case ')':
					checkch=st.pop();
					if(checkch=='{'||checkch=='[')
					return false;
				    break;
		
				case  '}':
					checkch=st.pop();
					if(checkch=='('||checkch=='[')
					return false;
				    break;
									
				case ']':
					checkch=st.pop();
					if(checkch=='{'||checkch=='(')
					return false;
				    break;	
				    
				}
			}
		
		return(st.isEmpty());
		}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Brackets");
		String Brackets=sc.next();
		if(checkBalance(Brackets))
		System.out.println("balanced brackets");
		else
		System.out.println("unbalanced brackets");
	
	}
}
