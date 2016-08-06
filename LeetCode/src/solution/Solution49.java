package solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
49. Group Anagrams  QuestionEditorial Solution  My Submissions
Total Accepted: 85228
Total Submissions: 293447
Difficulty: Medium
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
*/



public class Solution49 {
	
	
	  public List<List<String>> groupAnagrams(String[] strs) {
		  List<List<String>> fullsorts=new ArrayList<List<String>>();
		  HashMap<List<String>, List<String>> maps= new HashMap<List<String>, List<String>>();
		  List<List<String>> resulList=new ArrayList<List<String>>();
		  for(int i=0;i<strs.length;i++){
		  //判断该字符串是否存在某个全排列中
			  if(!IsContains(maps, fullsorts, strs[i])){
			  List<String> newFullSort=FullSort(strs[i].toCharArray(), 0, new ArrayList<String>());
			  fullsorts.add(newFullSort);
			  List<String> resultGroup=new ArrayList<String>();
			  resultGroup.add(strs[i]);
			  maps.put(newFullSort, resultGroup);
			  resulList.add(resultGroup);  
			  }
		  }
		  
		  return resulList;
	    }
	  public boolean IsContains( HashMap<List<String>, List<String>> maps,List<List<String>> fullsorts,String st){
		  for(List<String> stringSorts:fullsorts){
			  System.out.println(st);
			  for(String he:stringSorts)
					
				 if(he.equals(st)){
			
			  			maps.get(stringSorts).add(st);
			  			return true;
				 }
			  }
		  return false;
	  }
 
	  public List<String> FullSort(char[] st,int start,ArrayList<String> fullSort){
		  //求全排列
			if(start==st.length-1){
					fullSort.add(new String(st));
					}
					for(int i=start;i<st.length;i++){
						swap(start,i,st);
						FullSort(st,start+1,fullSort);
						swap(start,i,st);
					}
					return fullSort;
					
	  }
	  public void swap(int i,int j,char[] st){
			char temp=st[i];
			st[i]=st[j];
			st[j]=temp;
		}
	  public static void main(String[] args) {
		  Solution49 solution49=new Solution49();
	  String[] sts={"",""};
//		  for(String st:solution49.FullSort("eat".toCharArray(), 0, new ArrayList<String>()))
//				  System.out.println(st);
		for(List<String> st:solution49.groupAnagrams(sts))
			System.out.println(st.toString());
	  }
}
