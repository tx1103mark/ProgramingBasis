package solution;

import java.util.Stack;
import java.util.function.IntPredicate;

/*
42. Trapping Rain Water  QuestionEditorial Solution  My Submissions
Total Accepted: 76199
Total Submissions: 227691
Difficulty: Hard
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
*/



public class Solution42 {
	
	public int trap(int[] height) {
		int sum=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<height.length;i++){	
        		if(height[i]>height[i+1]){
        			stack.push(i);
        		}else {
					
					while(!stack.isEmpty()&&height[i]>=stack.peek()){
						int base=stack.pop();
						sum=sum+Math.min()*(stack.peek());
					}
				}
        			
        }
    }
	 
	 public static void main(String[] args) {
		
	}
}

