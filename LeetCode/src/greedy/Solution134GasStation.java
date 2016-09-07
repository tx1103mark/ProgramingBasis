package greedy;
/*
 * https://leetcode.com/problems/gas-station/
 * 关键思路
 * 如果从加油站A出发，最先不能达到加油站B，那么起点一定在B之后
 */
public class Solution134GasStation {
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        int sum=0;
	        int start=0;
	        int total=0;
	        for(int i=0;i<gas.length;i++){
	        	sum+=gas[i]-cost[i];
	        	if(sum<0){
	        		start=i+1;
	        		sum=0;
	        	}
	        	total+=sum;
	        }
	        return total>0?start:-1;
	    }
}
