package dynamicProgram;

public class LCS {
	  public int longestCommonSubsequence(String A, String B) {
	        // write your code here
		  char[] a=A.toCharArray();
		  char[] b=B.toCharArray();
		  int[][] c=new int[a.length+1][b.length+1];
		  for(int i=1;i<=a.length;i++)
			  for(int j=1;j<=b.length;j++){
				  if(a[i-1]==b[j-1])
					  c[i][j]=c[i-1][j-1]+1;
				  else c[i][j]=Math.max(c[i-1][j], c[i][j-1]);
			  }
		  return c[a.length][b.length];
	    }
}
