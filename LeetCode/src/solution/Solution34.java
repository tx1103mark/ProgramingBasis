package solution;

/*
 Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].
 */
public class Solution34 {

	 public static int[] searchRange(int[] nums, int target) {
	        int[] pos={-1,-1};
	        int left=0;
	        int right=nums.length-1;
	        while(left<=right){
	        	int mid=left+(right-left)/2;
	        	if(nums[mid]==target){
	        		System.out.println(mid);
	        		pos[0]=searchLeft(nums, target, left, mid);
	        		System.out.println(pos[0]);
	        		pos[1]=searchRight(nums, target, mid, right);
	        		System.out.println(pos[1]);
	        		return pos;
	        	}else if(nums[mid]>target){
					right=mid-1;
				}else {
					left=mid+1;
				}
	        }
	        return pos;
	    }
	 public static int searchLeft(int[] nums, int target,int left,int right){
		 int count=right;
		 while(left<=(count-1)&&nums[count-1]==target){
			 int mid=(left+right)/2;
			 if(nums[mid]==target){
				 count=mid;
			 	right=count;
		 }else 
			left=mid+1;
	 }
		 return count;
	 }
	 public static int searchRight(int[] nums, int target,int left,int right){
		 int count=left;
		 while((count+1)<=right&&nums[count+1]==target){
			 int mid=(left+right)/2;
			 if(nums[mid]==target){
				 count=mid;
			 	left=count+1;
		 }else 
			right=mid;
	 }
		 return count;
	 }
	 
	 public static void main(String[] args) {
		 int[] pos={8, 8, 8, 8, 8, 9};
		 System.out.println(Math.sqrt(1.44));
		 searchRange(pos, 8);
	}
}
