package solution;

/*
Implement int sqrt(int x).
 */
public class Solution69 {
//特别小心，整数乘法会发生溢出，用除法
	 public static int mySqrt(int x) {
		 if(x<2) return x;
	        int left=1;
	        int right=x/2;
	        while (left <= right) {
	            int mid = (left + right)/2;
	            if (x/mid == mid) return mid;
	            if (x/mid > mid) left = mid + 1;
	            else right = mid - 1;
	        }
	        return right;
	    }
	 public static void main(String[] args) {
		System.out.println(mySqrt(2147395599));
	}
}
