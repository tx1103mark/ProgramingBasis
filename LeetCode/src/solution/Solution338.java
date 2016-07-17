package solution;
/*
 * 338. Counting Bits
 * 
 * non negative
 */
public class Solution338 {

	 public static int[] countBits(int num) {
		 int[] bits=new int[num];	
		 for(int i=0;i<num;i++)
			 bits[i]=countBit(i);
		 return bits;
	    }
	 public static int countBit(int num){
		 int stad=1;
		 int count=0;
		 while(num!=0){
			 if((num&1)!=0)
				 count++;
			 num=num>>1;
		 }
		 return count;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(countBits(5)[0]);
	}
}
