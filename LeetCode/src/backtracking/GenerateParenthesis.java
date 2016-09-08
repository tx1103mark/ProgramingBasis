package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * http://www.lintcode.com/zh-cn/problem/generate-parentheses/
 * ���� n �����ţ���дһ�������Խ��������µ�������ϣ�������������Ͻ����
 * ������λ��k���ǻ�ʣ��left�������ź�right��������

���left��right��Ϊ�㣬��˵�������Ѿ����һ���Ϸ����У����Խ����ӡ����
���left>0����ӡ������
���right>0 ���� right>left ��ӡ������
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
