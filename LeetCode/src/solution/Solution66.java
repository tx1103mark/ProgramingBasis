package solution;

/*
 * 大数加一
 * 66. plus one
 *Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.
 */
public class Solution66 {

	   public static int[] plusOne(int[] digits) {
	
	        for (int i=digits.length-1;i>=0;i--) {
						if(++digits[i]>9){
						
							if(i!=0)
								digits[i]=0;
							else {
								int[] kuo=new int[digits.length+1];
								System.arraycopy(digits, 0, kuo, 1, digits.length);
								kuo[0]=1;
								kuo[1]=0;
								digits=kuo;
							}
						}else{
							return digits;
						}
	        }
			return digits;		
			
	    }
	 public static void main(String[] args) {
		 int[] digits={1,9,9,9,9};
		 for (int string : plusOne(digits)) {
			System.out.print(string+" ");
		}
	}
}
