package solution;

import java.lang.reflect.Array;
import java.util.*;

/*
30. Substring with Concatenation of All Words  QuestionEditorial Solution  My Submissions
Total Accepted: 61578
Total Submissions: 288936
Difficulty: Hard
You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

For example, given:
s: "barfoothefoobarman"
words: ["foo", "bar"]

You should return the indices: [0,9].
*/



public class Solution3lengthOfLongestSubstring {
	
	 public static int lengthOfLongestSubstring(String s) {
		 if(s==null||s.equals("")) return 0;
		 StringBuilder sb=new StringBuilder();
		 int max=1;
		 		for(int start=0,end=0;end<s.length();end++)	{
		 			String st=s.charAt(end)+"";
		 			if(sb.toString().contains(st)){
		 				if(sb.length()>max)
		 					max=sb.length();
		 				start=sb.indexOf(st);
		 				sb=sb.delete(0, start+1);
		 				sb.append(st);
		 			}else
		 				sb.append(st);
		 		}
		 		return Math.max(sb.length(),max);
	        }
	 public static int lengthOfLongestSubstring2(String s){
		 //双指针+hashtable
		 if(s==null||s.equals("")) return 0;
		 int max=1;
		 HashMap<Character, Integer> sub=new HashMap<Character, Integer>();
		 int start=0,end=0;
		 for(;end<s.length();end++){
			 
			 if(sub.get(s.charAt(end))!=null&&sub.get(s.charAt(end))>=start){
				 //在start和end之间存在重复数字，需删除进行比较
				 if(end-start>max)
					max=end-start;
				 start=sub.get(s.charAt(end))+1;
			 }
			 
			 sub.put(s.charAt(end),end);
		 }
		
		 return Math.max(max,end-start);
	 }
	 
	 public static int lengthOfLongestSubstring3(String s){
		 //双指针+hashtable(int数组实现)
		 if(s==null||s.equals("")) return 0;
		 int max=1;
		 int[] wind=new int[256];
		 int start=0,end=0;
		 Arrays.fill(wind, -1);
		 for(;end<s.length();end++){
			 	if(wind[s.charAt(end)]>=start)
			 		start=wind[s.charAt(end)]+1;
			 	wind[s.charAt(end)]=end;
			 	max=Math.max(max,end-start+1);
			 }
			 return max;
	 }
	    public static void main(String[] args) {
			System.out.println(lengthOfLongestSubstring2("aplaa"));
//	    	StringBuilder ss=new StringBuilder("pwwkew");
//	    	ss.delete(0, 2);
//	    	System.out.println(ss);
		}
}

