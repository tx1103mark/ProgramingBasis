package solution;

import java.lang.reflect.Array;
import java.util.*;

/*
76. Minimum Window Substring  QuestionEditorial Solution  My Submissions
Total Accepted: 68544
Total Submissions: 307294
Difficulty: Hard
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.
*/



public class Solution76minWindow {
	 	public static String minWindow(String s, String t) {
	        int[] src=new int[256];//���t��Ԫ�ؼ�����
	        for(int i=0;i<t.length();i++)
	        	src[t.charAt(i)]++;
	    
	        int[] des=new int[256];//��Ŵ���Ԫ�ظ���
	        int hasFound=0;
	        String result=s;
	        boolean isCon=false;
	        
	        LinkedList<Integer> windList=new LinkedList<Integer>();
	        for(int start=0,end=0;end<s.length();end++){
	        		char st=s.charAt(end);
	        		
	        		if(src[st]!=0){
	        			windList.add(end);
	        			//������Ԫ���±걣���������
	        			des[st]++;
	        			if(des[st]<=src[st]) hasFound++;
	        			//�ҵ�һ����������Ԫ�صĴ���
	        			if(hasFound==t.length()){
	        				//��С��������С
	        				
	        				start=windList.peekFirst();
	        				
	        				while(!windList.isEmpty()&&(des[s.charAt(start)]>src[s.charAt(start)])){
	        					windList.remove();
	        					des[s.charAt(start)]--;
	        					start=windList.peekFirst();
	        				}
	        				if(result.length()>end-start){
	        					isCon=true;
	        					result=s.substring(start,end+1);
	        				}
	        				
	        				des[s.charAt(windList.remove())]--;
	        				hasFound--;
	        			}
	        		}
	        }
	        if(!isCon)
	        	return "";
	        else return result;
	        	
	    }
	 
	    public static void main(String[] args) {
	    		String S = "A";
	    		String T = "A";
	    	System.out.println(minWindow(S, T));
		}
}

