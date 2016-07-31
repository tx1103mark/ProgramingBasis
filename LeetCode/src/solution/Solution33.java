package solution;

import java.util.function.IntPredicate;
/*33. Search in Rotated Sorted Array  QuestionEditorial Solution  My Submissions
Total Accepted: 112058
Total Submissions: 363355
Difficulty: Hard
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Subscribe to see which companies asked this question
[1,3,5,6], 0 ¡ú 0,
*/



public class Solution33 {
	
	
	 public static int searchInsert(int[] nums, int target) {
		 int n=nums.length;
		  int lo=0,hi=n-1;
	        // find the index of the smallest value using binary search.
	        // Loop will terminate since mid < hi, and lo or hi will shrink by at least 1.
	        // Proof by contradiction that mid < hi: if mid==hi, then lo==hi and loop would have been terminated.
	        while(lo<hi){
	            int mid=(lo+hi)/2;
	            if(nums[mid]>nums[hi]) lo=mid+1;
	            else hi=mid;
	        }
	        // lo==hi is the index of the smallest value and also the number of places rotated.
	        int rot=lo;
	        lo=0;hi=n-1;
	        // The usual binary search and accounting for rotation.
	        while(lo<=hi){
	            int mid=(lo+hi)/2;
	            int realmid=(mid+rot)%n;
	            if(nums[realmid]==target)return realmid;
	            if(nums[realmid]<target)lo=mid+1;
	            else hi=mid-1;
	        }
	        return -1;
	    }

public static void main(String[] args) {
	int[] st={5,1,3};
	System.out.println(searchInsert(st, 5));
}
	 
}
