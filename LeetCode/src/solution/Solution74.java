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
		 	int row=matrix.length;
		 	int col=matrix[0].length;
		 	return searchMat(matrix, target, 0, row-1);
	    }
	 public static boolean searchMat(int[][] oneMat,int target,int start,int end){
		 if(end>=start){
		 int col=oneMat[0].length;
		 if(start==end){
			
			 if(oneMat[start][col/2]==target)
				 return true;
			 
		 }else {
			 int temp=(start+end)/2;
			 if(oneMat[temp][col]>target){
				
			 		searchMat(oneMat, target, start, temp);
			 }
			 	else {
			 		
					searchMat(oneMat, target, temp, end);
				}
		}
	 }
		 return false;
	 }

public static void main(String[] args) {
	int[][] sts={{1,   3,  5,  7},
			  {10, 11, 16, 20},
			  {23, 30, 34, 50}};
	System.out.println(searchMatrix(sts, 20));
}
	 
}
