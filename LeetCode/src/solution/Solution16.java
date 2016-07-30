package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 16. 3Sum Closest 
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/



public class Solution16 {
	
	 public static int threeSumClosest(int[] nums, int target) {
		
		
		 Arrays.sort(nums);
			int closest=Integer.MAX_VALUE;
		 for(int i=0;i<nums.length-2;i++){
			 	
				int start=i+1;int end=nums.length-1;
				 while(start<end){
					 int sum=nums[start]+nums[end]+nums[i];
					 if(sum==target){
						return target;
					 }else if(sum>target)
						 	end--;
					 else start++;
					if(Math.abs(sum-target)<Math.abs(closest-target))
						closest=sum;
					 	
				 }
		 }
		 
		 return closest;
	    }
	 
	 public static void main(String[] args) {
		 int[] sum={-3,-2,-5,3,-4};
		 System.out.println(threeSumClosest(sum,-2));
	}
	 
}
