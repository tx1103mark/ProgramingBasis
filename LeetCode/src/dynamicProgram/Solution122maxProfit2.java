package dynamicProgram;
/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

public class Solution122maxProfit2 {

	 public int maxProfit(int[] prices) {
		 if(prices==null || prices.length==0)  
		        return 0;
		  int res=0;
 	       for(int i=0;i<prices.length-1;i++){
	    	   if(prices[i+1]>prices[i])
	    		   res+=prices[i+1]-prices[i];
	       }
 	       return res;
	    }
	 
	
}
