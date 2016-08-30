package dynamicProgram;
/*
 * https://leetcode.com/problems/maximum-subarray/
 */

public class Solution152maxProduct {

	 public int maxProduct(int[] nums) {
		 int globalMax=nums[0];//ȫ������
	        int localMax=nums[0];//�ֲ�����
	        int localmin=nums[0];//�ֲ�����ֵ����,ֵ��С
	        for(int i=1;i<nums.length;i++){
	        	int localcopy=localMax;
	        	localMax=Math.max(Math.max(nums[i], nums[i]*localMax),nums[i]*localmin);
	        	localmin=Math.min(Math.min(nums[i], nums[i]*localcopy),nums[i]*localmin);
	        	globalMax=Math.max(localMax, globalMax);
	        	
	        }
	        return globalMax;
	    }
}
