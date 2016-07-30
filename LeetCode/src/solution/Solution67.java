package solution;

/*
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */



public class Solution67 {
	
public static String addBinary(String a, String b) {
		int count=0;
        String longLength=a.length()>b.length()?a:b;
        String shortLength=a.length()>b.length()?b:a;
        int sum=0;
        StringBuilder sb=new StringBuilder();
        for(int i=longLength.length()-1;i>=0;i--){
        		if(i>=(longLength.length()-shortLength.length())){
        			sum=count+shortLength.charAt(i-longLength.length()+shortLength.length())+longLength.charAt(i)-2*'0';
        		}
        		else
        			sum=count+longLength.charAt(i)-'0';
        		count=sum>=2?1:0;
        	if(sum>=2){
        		sum=sum-2;	
        	}
        	sb.append(sum);
        }	
        if(count!=0)
        	sb.append(count);
        	return sb.reverse().toString();	
    }
	 public static void main(String[] args) {
		System.out.println(addBinary("111", "1"));
		 
	}
}
