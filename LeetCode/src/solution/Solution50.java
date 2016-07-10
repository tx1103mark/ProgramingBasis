package solution;
/*
 * Implement pow(x, n).
 * tags binary search ,math
 */
public class Solution50 {

public static double myPow(double x, int n) {
	        if(n == 0)
	            return 1;
	        if(n<0){
	            n = -n;
	            x = 1/x;
	        }
	     double sum=(n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
	     if(Double.isInfinite(sum))
	    	 return 0;
	    return sum;

}
public static void main(String[] args) {
	System.out.println(myPow(34.00515, -312123));
}
}
