package solution;

import java.util.Stack;
import java.util.function.IntPredicate;

/*
84. Largest Rectangle in Histogram  QuestionEditorial Solution  My Submissions
Total Accepted: 67308
Total Submissions: 270146
Difficulty: Hard
Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
*/



public class Solution84 {
	
	 public static int largestRectangleArea(int[] heights) {
		 	int max=0;
		 	int[] leftnum=new int[heights.length];
		 	int[] rightnum=new int[heights.length];
		 	leftnum[0]=-1;
		 	rightnum[heights.length-1]=heights.length;
	        for(int i=1;i<heights.length;i++){
	        	if(heights[i]>heights[i-1])
	        		leftnum[i]=i-1;
	        	else {
	        	int p=i-1;
	        	while(p>=0&&heights[p]>=heights[i])
	        		p=leftnum[p];
	        	leftnum[i]=p;
	        	}

	        }
	        for(int i=heights.length-2;i>=0;i--){
	        	if(heights[i]>heights[i+1])
	        		rightnum[i]=i+1;
	        	else {
					int p=i+1;
					while(p<heights.length&&heights[p]>=heights[i])
						p=heights[p];
					rightnum[i]=p;
				}
	        }
	        
	        for(int i=0;i<heights.length;i++)
	        	max=Math.max(max, heights[i]*(rightnum[i]-leftnum[i]-1));
	        
	        return max;
	        	
	    }
	 
	 public static int large2(int[] height){
		 if (height == null || height.length == 0) {
		        return 0;
		    }
		    int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
		    int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
		    lessFromRight[height.length - 1] = height.length;
		    lessFromLeft[0]  = -1;

		    for (int i = 1; i < height.length; i++) {
		        if (height[i] > height[i - 1]) {
		            lessFromLeft[i] = i - 1;
		        }
		        else  {
		            int p = i - 1;
		            while (p >= 0 && height[p] >= height[i]) p = lessFromLeft[p];                
		            lessFromLeft[i] = p;
		        }
		    }

		    for (int i = height.length - 2; i >= 0; i--) {
		        if (height[i] > height[i + 1]) {
		            lessFromRight[i] = i + 1;
		        }
		        else  {
		            int p = i + 1;
		            while (p < height.length && height[p] >= height[i]) p = lessFromRight[p];                
		            lessFromRight[i] = p;
		        }
		    }

		    int maxArea = 0;
		    for (int i = 0; i < height.length; i++) {
		        maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
		    }
		    return maxArea;
	 }
	 
	 public static void main(String[] args) {
		int[] a={2,1,5,6,2,3};
		System.out.println(largestRectangleArea(a));
	}
}

