package dynamicProgram;
/*
 * https://leetcode.com/problems/maximum-subarray/
 */

public class Solution53maxSubArray {

	 public int maxSubArray(int[] nums) {
	        int maxSum=0x80000000;
	        int currSum=0;
	        for(int i=0;i<nums.length;i++){
	        	if(currSum<=0)
	        		currSum=nums[i];
	        	else
	        		currSum+=nums[i];
	        	if(currSum>maxSum)
	        		maxSum=currSum;
	        }
	        return maxSum;
	    }
	 //��̬�滮�ľֲ����ź�ȫ�����Žⷨ
	 public int maxSubArray2(int[] nums) {
	        int globalMax=nums[0];//ȫ������
	        int localMax=nums[0];//�ֲ�����
	        for(int i=1;i<nums.length;i++){
	        	localMax=Math.max(nums[i], nums[i]+localMax);
	        	globalMax=Math.max(localMax, globalMax);
	        	
	        }
	        return globalMax;
	    }
}
