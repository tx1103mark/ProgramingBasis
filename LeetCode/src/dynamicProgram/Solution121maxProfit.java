package dynamicProgram;
/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class Solution121maxProfit {

	 public int maxProfit(int[] prices) {
		 if(prices==null || prices.length==0)  
		        return 0;
	        int globleMax=0;//全局最优
	        int localMax=0;//局部最优
	        for(int i=0;i<prices.length;i++){
	        	localMax=Math.max(localMax+prices[i+1]-prices[i], 0);
	        	globleMax=Math.max(globleMax, localMax);
	        }
	        return globleMax;
	    }
	 
	 public int maxProfit2(int[] prices) {
		 if(prices==null || prices.length==0)  
		        return 0;
		 
		 int max=0;
		 int brought=prices[0];
		 for(int i=1;i<prices.length;i++){
			 if(prices[i]>brought){
				 if(max<prices[i]-brought)
					 max=prices[i]-brought;
			 }else
				 brought=prices[i];
			 
		 }
		 return max;
	 }
}
