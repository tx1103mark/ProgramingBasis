package companyTest;
/*
 * �������ཻ����������ཻ�Ľڵ�
 */

//����ڵ㶨��
	class ListNode{
		int val;
		ListNode next;
		public ListNode(int x){
			val=x;
		}
	}
public class XiaoMi1 {
	
	
	//�ҵ����������һ���ཻ�ڵ㣬�����ཻ������null
	public static ListNode findFirstIntersectNode(ListNode l1,ListNode l2){
		//����������
		if(l1==null||l2==null)
			return null;
		int length1=1;
		int length2=1;
		ListNode head1=l1;
		ListNode head2=l2;
		ListNode intersectNode=null;
		while(l1.next!=null){
			length1++;
			l1=l1.next;
		}
		while(l2.next!=null){
			length2++;
			l2=l2.next;
		}
	
	
		if(l1!=l2)
			return null;
		l1=head1;
		l2=head2;

		for(int i=0;i<length2-length1;i++)
				if(length1>length2)
					l1=l1.next;
				else
					l2=l2.next;
	
		while(l1!=null&&l2!=null){
			if(l1==l2){
				intersectNode=l1;
				break;
			}
			else{
				l1=l1.next;
				l2=l2.next;
			}

		}
		
		return intersectNode;
	}
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(0);
		ListNode l2=new ListNode(1);
		ListNode l3=new ListNode(2);
		ListNode l4=new ListNode(3);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		
		ListNode b1=new ListNode(5);
		ListNode b2=new ListNode(6);
		ListNode b3=new ListNode(7);
		ListNode b4=new ListNode(8);
		b1.next=b2;
		b2.next=b3;
		b3.next=b4;
		b4.next=l4;
		
		if(findFirstIntersectNode(l1, b1)!=null)
		System.out.println(findFirstIntersectNode(l1, b1).val);
	}
}
