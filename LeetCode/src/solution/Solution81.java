package solution;

import java.util.function.IntPredicate;
/*
 * 81. Search in Rotated Sorted Array II  QuestionEditorial Solution  My Submissions
Total Accepted: 68612
Total Submissions: 212396
Difficulty: Medium
Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?

Write a function to determine if a given target is in the array.

Subscribe to see which companies asked this question
*/



public class Solution81 {
	
	
	 public static boolean searchInsert(int[] nums, int target) {
		 int i = 0, j = nums.length - 1;
	        while (i <= j) {
	            int mid = (i + j) / 2;
	            if (nums[mid] == target)
	                return true;
	            if (nums[i] < nums[mid]) {
	                if (nums[i] <= target && target < nums[mid])
	                    j = mid - 1;
	                else
	                    i = mid + 1;
	            } else if(nums[i]>nums[mid]){
	                if (nums[mid] < target && target <= nums[j])
	                    i = mid + 1;
	                else
	                    j = mid - 1;
	            }else {
					if(nums[i]==nums[j]){
						i++;j--;
					}else 
						i=mid+1;
				}
	        }
	        return false;
	    }

public static void main(String[] args) {
	int[] st={1,3,1,1,1};
	System.out.println(searchInsert(st, 3));
}
	 
}
