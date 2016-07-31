package solution;

import java.util.function.IntPredicate;
/*
 88. Merge Sorted Array  QuestionEditorial Solution  My Submissions
Total Accepted: 111443
Total Submissions: 365075
Difficulty: Easy
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

Subscribe to see which companies asked this question

Show Tags
Show Similar Problems
*/



public class Solution88 {
	
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	           int i=m+n-1;
	           m=m-1;
	           n=n-1;
	           while(m>=0&&n>=0){
	        	if(nums1[m]>=nums2[n])
	        		nums1[i--]=nums1[m--];
	        	else
	        		nums1[i--]=nums2[n--];
	           }
	        while(i>=0){
	        	if(m>=0)
	        		nums1[i--]=nums1[m--];
	        	if(n>=0)
	        		nums1[i--]=nums2[n--];
	        }
	        for (int j = 0; j < nums1.length; j++) {
	        	System.out.println(nums1[j]);
			}
	    }

public static void main(String[] args) {
	int[] st1={1,2,8,0,0,0};
	int[] st2={4,5,6};
	merge(st1,3, st2, 3);
}
	 
}
