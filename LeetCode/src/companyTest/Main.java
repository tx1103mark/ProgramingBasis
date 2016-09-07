package companyTest;

import java.io.*;
import java.util.*;
class Test {
}
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int a, b;
        while(cin.hasNextInt())
        {
            int count = cin.nextInt();
            for(int i=0;i<count;i++){   	
            	b = cin.nextInt();
            	System.out.println(geshu(b));
            }
        }
    }
    
    public static boolean count(int a){
    	//计算a的十进制表示
    	int sum1=0;
    	int b=a;
    	while(a>0){
    		sum1+=a%10;
    		a=a/10;
    	}
    	if(sum1>32)
    		return false;
    	//计算a中含有几个1
    	int sum2=0;
    	while(b>0){
    		++sum2;
    		b=b&(b-1);
    	}
    	
    	if(sum1==sum2)
    		return true;
    	else return false;
    }
    public static int  geshu(int b) {
//    	int b=21;
    	int count=1;
    	for(int i=2;i<=b;i++)
    		if(count(i))
    			count++;
		return count;
	}
}