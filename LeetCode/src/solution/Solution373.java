package solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

/*
 * You are given two integer arrays nums1 and nums2 sorted in ascending order and an integer k.
Define a pair (u,v) which consists of one element from the first array and one element from the second array.
Find the k pairs (u1,v1),(u2,v2) ...(uk,vk) with the smallest sums.

Example
Given nums1 = [1,7,11], nums2 = [2,4,6],  k = 3
Return: [1,2],[1,4],[1,6]
The first 3 pairs are returned from the sequence:
[1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 */
public class Solution373 {
	  public static List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		  
		  List<int[]> aList=new ArrayList<int[]>();
		  
		  		Queue<int[]> qi=new PriorityQueue<int[]>(k,new Comparator<int[]>() {
		  			public int compare(int[] s1,int[] s2){
		  				return (s1[0]+s1[1]-s2[0]-s2[1]);
		  			}
		  		});
	        	for (int i = 0; i < nums1.length; i++) {
					for (int j = 0; j < nums2.length; j++) {
						if((i+1)*(j+1)<=k)
							qi.add(new int[]{nums1[i],nums2[j]});
					}
				}
	        	
	        	 for(int i=0;i<k&&!qi.isEmpty();i++)
	        		 aList.add(qi.remove());
	        	 
	        	 for (int[] is : aList) {
					for (int i : is) {
						System.out.print(i);
					}
					System.out.println("");
				}
	        	return aList; 
	    }
	  public static void main(String[] args) {
		int[] num1={1,1,3};
		int[] num2={1,2,3};
		kSmallestPairs(num1, num2, 2);
	}
}
