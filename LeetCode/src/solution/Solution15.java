package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
15. 3Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 131957
Total Submissions: 675513
Difficulty: Medium
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/



public class Solution15 {
	
	 public static List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> sumList=new ArrayList<List<Integer>>();
		
		
		 Arrays.sort(nums);
		 
		 for(int i=0;i<nums.length-2&&nums[i]<=0;i++){
			 if(i>0&&nums[i]==nums[i-1])
          	   continue;
			 	int twosum=0-nums[i];
				int start=i+1;int end=nums.length-1;
				 while(start<end){
					 int sum=nums[start]+nums[end];
					 if(sum==twosum){
						 ArrayList<Integer> tmp = new ArrayList<Integer>();
		                   tmp.add(nums[i]); tmp.add(nums[start]); tmp.add(nums[end]);
		                   sumList.add(tmp);
		                   start++;end--;
		                   while(start<end&&nums[start]==nums[start-1])
		                	   start++;
		                   while(start<end&&nums[end]==nums[end+1])
		                	   end--;
					 }else if(sum>twosum)
						 end--;
					 else start++;
				 }
		 }
		 
		 return sumList;
	    }
	 
	 public static void main(String[] args) {
		 int[] sum={-1,0,1};
		 System.out.println(threeSum(sum).toString());
	}
	 
}
