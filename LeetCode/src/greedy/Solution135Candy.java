package greedy;

import java.util.Arrays;

/*
 * https://leetcode.com/problems/candy/
 * 关键思路
 * 从左遍历一次，从右遍历一次
 */
public class Solution135Candy {
	public int candy(int[] ratings) {
        int[] nums=new int[ratings.length];
        int result=0;
        Arrays.fill(nums, 1);
  //从左向右遍历
        for(int i=0;i<nums.length-1;i++)
        	if(ratings[i+1]>ratings[i])
        		nums[i+1]=nums[i]+1;
        
        
      //从右向左遍历
        for(int i=nums.length-1;i>0;i--)
        	if(ratings[i-1]>ratings[i])
        		nums[i-1]=Math.max(nums[i-1],nums[i]+1);
        
        for(int i=0;i<nums.length;i++)
        	result+=nums[i];
        return result;
    }
}