package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import solution.Solution143.ListNode;

/*
142. Linked List Cycle II  QuestionEditorial Solution  My Submissions
Total Accepted: 84133
Total Submissions: 268884
Difficulty: Medium
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?

Subscribe to see which companies asked this question
*/



public class Solution142 {
	  public class ListNode {
		    int val;
		     ListNode next;
		     ListNode(int x) { val = x; }}
	  public ListNode detectCycle(ListNode head) {
	        //首先求出环的长度，
		  if (head == null || head.next == null) return null; 
		  
		  if(head.next==head) return head;
	      
		  if(head.next.next==head) return head;
		  
		  ListNode slow=head;
	        ListNode fast=head;
	        while(fast.next!=null&&fast.next.next!=null){
	        
	        	fast=fast.next.next;
	        	slow=slow.next;
	        	if(fast==slow) break;
	        }
	        if(fast.next==null||fast.next.next==null) return null;
	        //求长度
	        int length=1;
	        while(fast.next!=slow){
	        	length++;
	        	fast=fast.next;
	        }
	        slow=head;
	        fast=head;
	        //先走环长度的步数
	        for(int i=0;i<length;i++)
	        	fast=fast.next;
	        while(slow!=fast){
	        	slow=slow.next;
	        	fast=fast.next;
	        }
	        	return slow;
	    }
	  //加测是否有环
	  public ListNode isCycle(ListNode head){
		  if (head == null || head.next == null) return null; 
		   
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast.next!=null&&fast.next.next!=null){
	        	
	        	fast=fast.next.next;
	        	slow=slow.next;
	        	if(fast==slow) return slow;
	        }
	        
	        return null;
	       
	    }
	  }
	   
	 

