package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

143. Reorder List  QuestionEditorial Solution  My Submissions
Total Accepted: 71364
Total Submissions: 302126
Difficulty: Medium
Given a singly linked list L: L0→L1→…→Ln-1→Ln,
reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

You must do this in-place without altering the nodes' values.

For example,
Given {1,2,3,4}, reorder it to {1,4,2,3}.

Subscribe to see which companies asked this question
*/



public class Solution143 {
	  public class ListNode {
		    int val;
		     ListNode next;
		     ListNode(int x) { val = x; }}
	   public void reorderList(ListNode head) {
		   if (head == null || head.next == null) return;
		   
	        ListNode slow=head;
	        ListNode fast=head;
	        while(fast.next!=null&&fast.next.next!=null){
	        	fast=fast.next.next;
	        	slow=slow.next;
	        }
	        fast=slow.next;
	        slow.next=null;
	        slow=head;
	        //反转链表后半段部分
	        ListNode preNode=null;
	        while(fast!=null){
	        	ListNode nextListNode=fast.next;
	        	fast.next=preNode;
	        	preNode=fast;
	        	fast=nextListNode;
	        }
	        fast=preNode;
	        //插入到链表前半部分
	        while(fast!=null){
	        	ListNode next=fast.next;
	        	fast.next=slow.next;
	        	slow.next=fast;
	        	slow=slow.next.next;
	        	fast=next;
	        }
	        
	    }
	   
	 
}
