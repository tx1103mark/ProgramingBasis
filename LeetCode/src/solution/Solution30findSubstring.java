package solution;

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



public class Solution30findSubstring {
	

public static ArrayList<Integer> findSubstring(String S, String[] L) {
    // Note: The Solution object is instantiated only once and is reused by each test case.
    ArrayList<Integer> res = new ArrayList<Integer>();
    if(S==null || S.length()==0 || L==null || L.length==0)
        return res;
    HashMap<String,Integer> map = new HashMap<String,Integer>();
    for(int i=0;i<L.length;i++)
    {
        if(map.containsKey(L[i]))
        {
            map.put(L[i],map.get(L[i])+1);
        }
        else
        {
            map.put(L[i],1);
        }
    }
    for(int i=0;i<L[0].length();i++)
    {
        HashMap<String,Integer> curMap = new HashMap<String,Integer>();
        int count = 0;
        int left = i;
        for(int j=i;j<=S.length()-L[0].length();j+=L[0].length())
        {
            String str = S.substring(j,j+L[0].length());
            
            if(map.containsKey(str))
            {
                if(curMap.containsKey(str))
                    curMap.put(str,curMap.get(str)+1);
                else
                    curMap.put(str,1);
                if(curMap.get(str)<=map.get(str))
                    count++;
                else
                {
                    while(curMap.get(str)>map.get(str))
                    {
                        String temp = S.substring(left,left+L[0].length());
                        if(curMap.containsKey(temp))
                        {
                            curMap.put(temp,curMap.get(temp)-1);
                            if(curMap.get(temp)<map.get(temp))
                                count--;
                        }
                        left += L[0].length();
                    }
                }
                if(count == L.length)
                {
                    res.add(left);
                    //if(left<)
                    String temp = S.substring(left,left+L[0].length());
                    if(curMap.containsKey(temp))
                        curMap.put(temp,curMap.get(temp)-1);
                    count--;
                    left += L[0].length();
                }
            }
            else
            {
                curMap.clear();
                count = 0;
                left = j+L[0].length();
            }
        }
    }
    return res;
}
	 
	public static void main(String[] args) {
		String s="aaaaaaaaa";
		String[] t={"aaa","aaa", "aaa"};
		System.out.println(findSubstring(s,t));
	}
}

