package solution;
/*
 * 344. Reverse String
 */
public class Solution344 {
	
	 public static String reverseString(String s) {
	      char[] st=s.toCharArray();
	      StringBuilder sb=new StringBuilder();
	      for (int i = st.length-1; i >= 0; i--) {
			sb.append(st[i]);
		}
	        return sb.toString();
	        
	    }
	 
	 public static void main(String[] args) {
	}
}
