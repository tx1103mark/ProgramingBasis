package solution;

/*
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution2 {
	
	public class ListNode {
		     int val;
		      ListNode next;
		     ListNode(int x) { val = x; }
	}
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 	int sum=0;
		 	ListNode head= new ListNode(0);
		 	ListNode back=head;
		 	while(l1!=null||l2!=null){
		 	if(l1!=null){
		 				sum=sum+l1.val;
		 				l1=l1.next;
		 	}
		 	
		 	if(l2!=null){
 				sum=sum+l2.val;
 				l2=l2.next;
 			}
		 	ListNode ln=new ListNode(sum%10);
		 	sum=sum/10;
		 	head.next=ln;
		 	head=ln;
	    }
		 	if(sum!=0){
		 	ListNode ln=new ListNode(sum);
		 	head.next=ln;
		 	head=ln;
		 	}
		 	return back.next;
	 }
}
