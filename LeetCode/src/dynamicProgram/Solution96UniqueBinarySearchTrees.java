package dynamicProgram;
/*
 * https://leetcode.com/problems/unique-binary-search-trees/
 */
/*Ë¼Ïë²Î¿¼http://blog.csdn.net/linhuanmars/article/details/24761459
 */
public class Solution96UniqueBinarySearchTrees {

	 public int numTrees(int n) {
		 if(n<0) return 0;
		 int[] res=new int[n];
		 res[0]=1;
		 res[1]=1;
	        for(int i=2;i<=n;i++){
	        	for(int j=0;j<i;j++)
	        		res[i]+=res[j]*res[i-1-j];
	        }
	        return res[n];
	    }
	    
}
