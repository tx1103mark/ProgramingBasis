package solution;

/*
 Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class Solution27 {

	 public static int removeDuplicates(int[] nums) {

		 int i=0;
         int j=0;
         for (i = 1; i < nums.length; i++){ 
			 if(nums[i]!=nums[j])
				    nums[++j]=nums[i];
         }
		return j+1;
	    
	    }
	 public static void main(String[] args) {
		 int[] nums = {1,1,1,2,2};
		 int val=3;
		System.out.println(removeDuplicates(nums)+" "+nums[0]+nums[1]);
	}
}
