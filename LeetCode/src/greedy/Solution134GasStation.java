package greedy;
/*
 * https://leetcode.com/problems/gas-station/
 * �ؼ�˼·
 * ����Ӽ���վA���������Ȳ��ܴﵽ����վB����ô���һ����B֮��
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
