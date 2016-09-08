package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 *http://www.lintcode.com/zh-cn/problem/letter-combinations-of-a-phone-number/
 ��һ��������01�������ַ�����ÿ�����ִ���һ����ĸ���뷵�������п��ܵ���ĸ��ϡ�
 */
public class LetterCombinations {
	
	String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public ArrayList<String> letterCombinations(String digits){
        // Write your code hereif
		
		List<String> result=new ArrayList<String>();
		
		 if (digits == null) {
			 return (ArrayList<String>) result; 
		 }
		dfs(digits,new StringBuilder(),result,0);
		return (ArrayList<String>) result;
    }
	
	public void dfs(String digits,StringBuilder sb,List<String> result,int index){
		int len=digits.length();
		if(len==index){
			result.add(sb.toString());
			return;
		}
		String temp=map[Integer.parseInt(digits.charAt(index)+"")];
		for(int i=0;i<temp.length();i++){
			sb.append(temp.charAt(i));
			dfs(digits, sb, result,index+1);
			sb.deleteCharAt(sb.length()-1);
		}
			
	}
	
}
