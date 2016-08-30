package dynamicProgram;

import java.util.Arrays;
/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
 */

public class Solution188maxProfit4 {


		 public static int maxProfit(int k, int[] prices) {
	         if(prices==null || prices.length==0)  
	        return 0;  
	         if (k > prices.length / 2) { // in this case, it's the same problem as Best Time to Buy & Sell Stock II
	             int max = 0;
	             for (int i = 0; i < prices.length - 1; i++) {
	                 int diff = prices[i + 1] - prices[i];
	                 max += diff>0 ? diff : 0;
	             }
	             return max;
	         } else {
	    int[] local = new int[k+1];  
	    int[] global = new int[k+1];  
	    for(int i=0;i<prices.length-1;i++)  
	    {  
	        int diff = prices[i+1]-prices[i];  
	        for(int j=k;j>=1;j--)  
	        {  
	            local[j] = Math.max(global[j-1]+(diff>0?diff:0), local[j]+diff);  
	            global[j] = Math.max(local[j],global[j]);  
	        }  
	    }  
	    return global[k];
	         }
		 }
		 
		 public int maxProfit2(int k, int[] prices) {
		        if (k <= 0 || prices == null || prices.length <= 0) return 0;
		        if (k > prices.length / 2) { // in this case, it's the same problem as Best Time to Buy & Sell Stock II
		            int max = 0;
		            for (int i = 0; i < prices.length - 1; i++) {
		                int diff = prices[i + 1] - prices[i];
		                max += diff>0 ? diff : 0;
		            }
		            return max;
		        } else {
		            int [] buy = new int[k];
		            int [] sell = new int[k];
		            
		            Arrays.fill(buy, Integer.MIN_VALUE);
		            
		            for (int price: prices) {
		                int tmp = 0;
		                for (int i = 0; i < k; i ++) {
		                    int buffer = 0;                          // used to avoid duplicate calculation
		                    buffer = tmp - price;
		                    if (buy[i] < buffer) buy[i] = buffer;
		                    
		                    buffer = buy[i] + price;
		                    if (sell[i] < buffer) sell[i] = buffer;
		                    tmp = sell[i];
		                }
		            }
		            
		            return sell[k - 1];
		        }
		        
		    }
		 
		 public static void main(String[] args) {
			 int k=4;
			 int[] a={1,2,4,2,5,7,2,4,9,0};
			System.out.println(maxProfit(4, a));
		}
	
}
