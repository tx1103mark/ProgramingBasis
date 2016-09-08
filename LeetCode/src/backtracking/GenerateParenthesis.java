package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * http://www.lintcode.com/zh-cn/problem/generate-parentheses/
 * 给定 n 对括号，请写一个函数以将其生成新的括号组合，并返回所有组合结果。
 * 假设在位置k我们还剩余left个左括号和right个右括号

如果left和right均为零，则说明我们已经完成一个合法排列，可以将其打印出来
如果left>0，打印左括号
如果right>0 并且 right>left 打印右括号
 */
public class GenerateParenthesis {
	 public ArrayList<String> generateParenthesis(int n) {
	        // Write your code here
		 List<String> res=new ArrayList<String>();
		 generate(n, n, res, "");
		 return (ArrayList<String>) res;
	    }
	 
	 public void generate(int leftNum,int rightNum,List<String> result,String s){
		 if(leftNum==0&&rightNum==0)
			 	result.add(s);
		 if(leftNum>0)
			 generate(leftNum-1, rightNum, result, s+'(');
		 if(rightNum>0&&rightNum>leftNum)
			 generate(leftNum, rightNum-1, result, s+')');
		 
	 }
}
