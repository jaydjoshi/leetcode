package test.leetcode;

import java.util.Stack;

public class Valid {

public static boolean isValid(String s) {
    int len = s.length();
    char c,cs;
    boolean flag=true;
    Stack<Character> stack = new Stack<Character>();
    int i;
    if(len==0 || len==1 || len%2 !=0)
    	return false;
    
    
    for (i=0; i<len ; i++)
    {
    	c = s.charAt(i);
        
        if(c == '(' || c == '{' || c == '[')
        {
        	stack.push(c);
        	continue;
        }
        else
        {
             if(stack.isEmpty()) return false; 
        	cs = stack.peek();
        	if((c == ')' && (cs=='(')) || (c == '}' && (cs=='{')) || (c == ']' && (cs=='[')))
        	{
        		flag = true;
        		stack.pop();
        	}
        	else
        	{
        		flag= false;
        		break;
        	}
        
        }
    }
     if(!stack.isEmpty()) return false; 
    return flag;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isValid("(){}"));
		System.out.println(isValid("({})[]"));
		System.out.println(isValid("()(}"));

	}

}


