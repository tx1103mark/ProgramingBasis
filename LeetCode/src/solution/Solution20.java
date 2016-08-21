package solution;

import java.util.Stack;

/*
20. Valid Parentheses  QuestionEditorial Solution  My Submissions
Total Accepted: 125480
Total Submissions: 410510
Difficulty: Easy
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Subscribe to see which companies asked this question
*/



public class Solution20 {
	
	 public static boolean isValid(String s) {
	        Stack<Integer> stack =new Stack<Integer>();
	   
	        for(int i=0;i<s.length();i++){
	        	if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
	        		stack.push(i);
	        	else if(!stack.isEmpty()){
	       
	        		int st=s.charAt(stack.pop())-s.charAt(i);
	        	
	        		if((st=='('-')')||(st=='['-']')||st==('{'-'}'))
	        			continue;
	        		else return false;
	        	}else return false;
	        }
	        if(stack.isEmpty())
	        	return true;
	        else return false;
	    }
	 public static void main(String[] args) {
		System.out.println(isValid("()"));
	}
}

