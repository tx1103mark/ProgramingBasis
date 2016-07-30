package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
18. 4Sum  QuestionEditorial Solution  My Submissions
Total Accepted: 81111
Total Submissions: 330857
Difficulty: Medium
Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/



public class Solution18 {
	
	 public static List<List<Integer>> threeSum(int[] nums,int target) {
		 List<List<Integer>> sumList=new ArrayList<List<Integer>>();
		
		
		 Arrays.sort(nums);
		 for(int j=0;j<nums.length-3;j++){
			 if(j>0&&nums[j]==nums[j-1])
	          	   continue;
		 for(int i=j+1;i<nums.length-2;i++){
			 if(i>j+1&&nums[i]==nums[i-1])
          	   continue;
			 	int twosum=target-nums[i]-nums[j];
				int start=i+1;int end=nums.length-1;
				 while(start<end){
					 int sum=nums[start]+nums[end];
					 if(sum==twosum){
						 ArrayList<Integer> tmp = new ArrayList<Integer>();
		                   tmp.add(nums[j]);tmp.add(nums[i]); tmp.add(nums[start]); tmp.add(nums[end]);
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
		 }
		 
		 return sumList;
	    }
	 
	 public static void main(String[] args) {
		 int[] sum={0,4,-5,2,-2,4,2,-1,4};
		 System.out.println(threeSum(sum,12).toString());
	}
	 
}
