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
}

