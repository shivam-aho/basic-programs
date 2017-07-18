import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner cin=new Scanner(System.in);
String x=cin.next();
Boolean isbalanced=isBalanced(x);
	System.out.println("is string balanced?? :-"+ isbalanced);
	}
	public static boolean isBalanced(String str)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='(' ||ch=='[' || ch=='{' )
			{
				stack.push(ch);
			}
			else if(ch=='}')
			{
				if(stack.isEmpty()) return false;
				if(stack.pop()!='{') return false;
			}
			else if (ch==')')
			{
				if(stack.isEmpty()) return false;
				if(stack.pop()!='(') return false;
			}
			else if(ch==']')
			{
				if(stack.isEmpty()) return false;
				if(stack.pop()!='[') return false;
			}
		}
	return stack.isEmpty();
	}

}
