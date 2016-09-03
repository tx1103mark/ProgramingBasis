package greedy;

public class Solution55JumpGameII {
	 public static int canJump(int[] nums) {
		 if(nums.length==1)
			 return 0;
		 	int minstep=0;
		 	int cur=0;
		 	int maxReach=0;
		 	int i=0;
		 	while(cur<nums.length){
		 		if(maxReach>=nums.length)
	 				break;
		 		while(i<=cur){
		 			maxReach=Math.max(maxReach,nums[i]+i);
		 			i++;
		 			if(maxReach>=nums.length)
		 				break;
		 		}
		 		minstep++;
		 		cur=maxReach;
		 	}
		 	return minstep;
	 }
	 public static void main(String[] args) {
		int[] nums={2,3,1,1,4};
		System.out.println(canJump(nums));
	}
}
