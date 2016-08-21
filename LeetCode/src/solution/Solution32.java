package solution;

import java.util.Stack;

/*
32. Longest Valid Parentheses  QuestionEditorial Solution  My Submissions
Total Accepted: 70325
Total Submissions: 308963
Difficulty: Hard
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.

Subscribe to see which companies asked this question
*/



public class Solution32 {
	
	 public int longestValidParentheses(String s) {
		 Stack<Integer> st=new Stack<Integer>();
		 int count=0;
		 int res=0;
		 for(int i=0;i<s.length();i++)
			 if(s.charAt(i)=='('){
				 st.push(count);
				 count=0;
			 }else if(st.empty()==false){
				 count+=st.pop();
				 res=Math.max(res, count);
			 }else{
				 count=0;
			 }
				 
			 return res*2;
	    }
	 
	 public int longestValidParentheses2(String s) {
		 Stack<Integer> stack=new Stack<Integer>();
		 int max=0;
		 int left=-1;
		 for(int j=0;j<s.length();j++){
			 if(s.charAt(j)=='(') stack.push(j);
			 else {
				 if(stack.isEmpty()) left=j;
				 else {
					 stack.pop();
					 if(stack.isEmpty()) max=Math.max(max, j-left);
					 else max=Math.max(max, j-stack.peek());
				 }
			 }
		 }
		 return max;
	 }
}

