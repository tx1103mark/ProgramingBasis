package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import solution.Solution143.ListNode;

/*
61. Rotate List  QuestionEditorial Solution  My Submissions
Total Accepted: 77747
Total Submissions: 331848
Difficulty: Medium
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.

Subscribe to see which companies asked this question
*/



public class Solution61 {
	  public class ListNode {
		    int val;
		     ListNode next;
		     ListNode(int x) { val = x; }}
	  public ListNode rotateRight(ListNode head, int k) {
	        ListNode slow=head;
	        ListNode fast=head;
	        for(int i=0;i<k&&fast!=null;i++){
	        	fast=fast.next;
	        }
	        if(fast==null)
	        	return null;
	    }
	 
}
