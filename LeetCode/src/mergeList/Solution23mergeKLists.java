package mergeList;
/*
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class Solution23mergeKLists {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length==1)
			return lists[0];
		ListNode[] back=mergeKLists2(lists);
		return back[0];
    }
	public ListNode[] mergeKLists2(ListNode[] lists){
		if(lists.length!=1){
			ListNode[] copy=new ListNode[(lists.length+1)/2];
			if(lists.length%2==0){
		for(int i=0;i<lists.length/2;i++)
			copy[i]=merge2List(lists[i], lists[lists.length-1-i]);
			}else{
				for(int i=0;i<lists.length/2;i++)
					copy[i]=merge2List(lists[i], lists[lists.length-1-i]);
				copy[(lists.length+1)/2]=lists[(lists.length+1)/2];
			}
				
		 	return mergeKLists2(copy);
		}
		else return lists;
	}
	public ListNode merge2List(ListNode l1,ListNode l2){
		ListNode result=new ListNode(1);
		if(l1!=null&&l2!=null){
			if(l1.val>l2.val){
				result.val=l2.val;
				l2=l2.next;
				result.next=merge2List(l1, l2);
			}else{
				result.val=l1.val;
				l1=l1.next;
				result.next=merge2List(l1, l2);
			}
			return result;
		}
		if(l1==null)
			return l2;
		else return l1;
	}
}
