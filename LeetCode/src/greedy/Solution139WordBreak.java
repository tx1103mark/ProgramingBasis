package greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/word-break/
 * ¹Ø¼üË¼Â·
 * µÝ¹é
 */
public class Solution139WordBreak {
	 public static boolean wordBreak(String s, Set<String> dict) {
		 boolean[] f = new boolean[s.length() + 1];
	        
	        f[0] = true;
	        
	        
	        /* First DP
	        for(int i = 1; i <= s.length(); i++){
	            for(String str: dict){
	                if(str.length() <= i){
	                    if(f[i - str.length()]){
	                        if(s.substring(i-str.length(), i).equals(str)){
	                            f[i] = true;
	                            break;
	                        }
	                    }
	                }
	            }
	        }*/
	        
	        //Second DP
	        for(int i=1; i <= s.length(); i++){
	            for(int j=0; j < i; j++){
	                if(f[j] && dict.contains(s.substring(j, i))){
	                    f[i] = true;
	                    break;
	                }
	            }
	        }
	        
	        return f[s.length()];
	    }
	        
	    
	 public static void main(String[] args) {
		 String s="goalspecial";
		 Set<String> wordDict=new HashSet<String>();
		 wordDict.add("go");
		 wordDict.add("goal");
		 wordDict.add("goals");
		 wordDict.add("special");
		System.out.println(wordBreak(s, wordDict));
	}
	
}