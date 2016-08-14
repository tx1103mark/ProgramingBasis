package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import solution.Solution143.ListNode;

/*
141. Linked List Cycle  QuestionEditorial Solution  My Submissions
Total Accepted: 122535
Total Submissions: 336785
Difficulty: Easy
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

Subscribe to see which companies asked this question
*/



public class Solution141 {
	  public class ListNode {
		    int val;
		     ListNode next;
		     ListNode(int x) { val = x; }}
	  public boolean hasCycle(ListNode head) {
		  if (head == null || head.next == null) return false; 
		   
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast.next!=null&&fast.next.next!=null){
	        	if(fast==slow) return true;
	        	fast=fast.next.next;
	        	slow=slow.next;
	        }
	        
	        return false;
	       
	    }
	   
	 
}
