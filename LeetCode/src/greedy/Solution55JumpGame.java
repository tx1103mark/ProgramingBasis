package greedy;

public class Solution55JumpGame {
	 public boolean canJump(int[] nums) {
	        int max=0;
	        int i=0;
	        while(i<nums.length){
	        	max=Math.max(max, nums[i]);
	        	if(max==0&&i<nums.length-1)
	        		return false;
	        	max--;
	        	i++;
	        }
	        return true;
	    }
}
