package solution;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntPredicate;
/*
41. First Missing Positive  QuestionEditorial Solution  My Submissions
Total Accepted: 70359
Total Submissions: 290337
Difficulty: Hard
Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.

Subscribe to see which companies asked this question
Show Similar Problems
*/



public class Solution41 {
	
	
	 public static int firstMissingPositive(int[] nums) {
		 if(nums.length==0)
			 return 1;
		for (int i = 0; i < nums.length; i++) {
			while(nums[i]!=i+1)
				if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1])
					swap(nums,i,nums[i]-1);
				else
					break;
		}
		for (int i = 0; i < nums.length; i++)
			if(nums[i]!=i+1)
				return i+1;
		return nums.length+1;
	    }
	 public static void swap(int[] a,int i,int j){
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
	 }

public static void main(String[] args) {
	
	int[] st2={1,1};
	System.out.println(firstMissingPositive(st2));
}
	 
}
