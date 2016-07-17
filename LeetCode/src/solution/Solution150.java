package solution;

import java.util.Stack;

/*
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * 150. Evaluate Reverse Polish Notation  QuestionEditorial Solution  My Submissions
Total Accepted: 68934
Total Submissions: 283511
Difficulty: Medium
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class Solution150 {
	
public static int evalRPN(String[] tokens) {
        Stack<String> tokenStack=new Stack<String>();
        for (int i = 0; i < tokens.length; i++) {
			switch (tokens[i]) {
			case "+":{
				int j=Integer.parseInt(tokenStack.pop());
				int k=Integer.parseInt(tokenStack.pop());
				tokenStack.push(j+k+"");
			}
				break;
			case "*":{
				int j=Integer.parseInt(tokenStack.pop());
				int k=Integer.parseInt(tokenStack.pop());
				tokenStack.push(j*k+"");
			}
			break;
			case "/":{
				int j=Integer.parseInt(tokenStack.pop());
				int k=Integer.parseInt(tokenStack.pop());
				tokenStack.push(k/j+"");
			}
				break;
			case "-":{
				int j=Integer.parseInt(tokenStack.pop());
				int k=Integer.parseInt(tokenStack.pop());
				tokenStack.push(k-j+"");
			}
				break;
			default:
				tokenStack.push(tokens[i]);
				break;
			}
		}
        return Integer.parseInt(tokenStack.peek());
    }

public static void main(String[] args) {
	String[] sts={"4", "13", "5", "/", "+"};
	System.out.println(evalRPN(sts));
}
	 
}
