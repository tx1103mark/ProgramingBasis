package solution;

import java.util.function.IntPredicate;
/*35. Search Insert Position  QuestionEditorial Solution  My Submissions
Total Accepted: 115590
Total Submissions: 304390
Difficulty: Medium
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 ¡ú 2
[1,3,5,6], 2 ¡ú 1
[1,3,5,6], 7 ¡ú 4
[1,3,5,6], 0 ¡ú 0,
*/



public class Solution74 {
	
	
	
	 public static int searchInsert(int[] nums, int target) {
	        int l=0;int r=nums.length-1;
	        while(l<=r){
	        	int mid=(l+r)/2;
	        	if(nums[mid]==target)
	        		return mid;
	        	else if(nums[mid]>target)
	        			r=mid-1;
	        	else l=mid+1;
	        }
	        return l;
	    }

public static void main(String[] args) {
	int[] st={1,3,5,6};
	System.out.println(searchInsert(st, 2));
}
	 
}
