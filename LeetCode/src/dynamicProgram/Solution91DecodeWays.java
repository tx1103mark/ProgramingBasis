package dynamicProgram;
/*
 * https://leetcode.com/problems/decode-ways/
 */
/*
 * 假设已经知道s的i-1和i-2的解法
 * 把范围分成几个区间：
（1）00：res[i]=0（无法解析，没有可行解析方式）；
（2）10, 20：res[i]=res[i-2]（只有第二种情况成立）；
（3）11-19, 21-26：res[i]=res[i-1]+res[i-2]（两种情况都可行）；
（4）01-09, 27-99：res[i]=res[i-1]（只有第一种情况可行）；
 */
public class Solution91DecodeWays {

	 public int numDecodings(String s) {
		 if(s==null || s.length()==0 || s.charAt(0)=='0')  
		    {  
		        return 0;  
		    }  
		 int num1=1;
		 int num2=1;
		 int num3=1;
	        for(int i=1;i<s.length();i++){
	        	int j=(s.charAt(i-1)-'0')*10+(s.charAt(i)-'0');
	        	if(s.charAt(i)=='0'){
	        		if(s.charAt(i-1)=='1' || s.charAt(i-1)=='2') 
	        			num3=num1;
	        		else return 0;
	        	}
	        	else if(26>=j&&j>=11)
	        			num3=num1+num2;
	        	else num3=num2;
	        	
	        	num1=num2;
	        	num2=num3;
	        	}
	        
	        return num2;
	        }
	    
}
