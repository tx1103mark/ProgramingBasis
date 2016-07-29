package solution;

import java.util.function.IntPredicate;
/*74. Search a 2D Matrix  QuestionEditorial Solution  My Submissions
Total Accepted: 86199
Total Submissions: 249894
Difficulty: Medium
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,
*/



public class Solution74 {
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
		   if (matrix.length == 0 || matrix[0].length == 0) return false;
		 
		 int m=matrix.length;
		 int n=matrix[0].length;
		 int left=0;
		 int right=m*n-1;
		 while(left<=right){
			 int mid=left+(right-left)/2;
			 int row=mid/n;
			 int col=mid%n;
			 if(target==matrix[row][col])
				 return true;
			 else if(matrix[row][col]>target)
				 right=mid-1;
			 else left=mid+1;
		 }
		 return false;
	 }

public static void main(String[] args) {
	int[][] sts={{1,   3,  5,  7},
			  {10, 11, 16, 20},
			  {23, 30, 34, 50}};
	System.out.println(searchMatrix(sts, 4));
}
	 
}
