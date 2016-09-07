package companyTest;

import java.io.*;
import java.util.*;

import javax.sound.sampled.ReverbType;

public class Main2
{
//    public static void main(String args[])
//    {
//        Scanner cin = new Scanner(System.in);
//        int a, b;
//        while(cin.hasNextInt())
//        {
//            int acount = cin.nextInt();
//            int sum=0;
//            int[] as=new int[acount];
//            int bcount=cin.nextInt();
//            String[] s=new String[bcount];
//            int[] scount=new int[bcount];
//            for(int i=0;i<acount;i++)
//            	as[i]=cin.nextInt();
//            for(int i=0;i<bcount;i++)
//            	s[i]=cin.next();
//            Arrays.sort(as);
//            int max=0;
//            for(int i=0;i<bcount;i++){
//            	sum+=as[i];
//            }
//            for(int i=as.length-1;i>=as.length-bcount;i--){
//            	max+=as[i];
//            }
//            System.out.print(sum+" ");
//            System.out.println(max);
//            
//        }
//        
//        
//    }
    
    public static int[] reverseToArray(HashMap<String, Integer> map,int n){
    	//将对象转为数组
    	int[] result=new int[n];
    	int i=0;
    	for(String keys:map.keySet()){
    		result[i++]=map.get(keys);
    	}
    for(int j:result)
    	System.out.println(j+" ");
    
    return result;
    }
    
   public static void main(String[] args) {
	   HashMap<String, Integer> map=new HashMap<String, Integer> ();
	   map.put("a", 1);
	   map.put("b", 2);
	   map.put("c", 3);
	   System.out.println(reverseToArray(map, 6));
}
    
    	
}