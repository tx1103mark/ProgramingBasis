package companyTest;


public class CopyOfTuYaYiDong2 {

	static Node swap(Node head){
		if(head==null)
			return null;
		Node end = head;
		Node prev = null;
		Node curr = head;
		
		while (end.next != null)
			end = end.next;
		
		Node new_end = end;
		
		// ������ͷ�������õ���һ��ż���ڵ�
				while (curr.value %2 !=0 && curr != end)
				{
					new_end.next = curr;
					curr = curr.next;
					new_end.next.next = null;
					new_end = new_end.next;
				}

				// �����ż���ڵ�
				if (curr.value %2 ==0)
				{
					head = curr;

					// �ӵ�һ��ż���ڵ㿪ʼ
					while (curr != end)
					{
						if (curr.value % 2 == 0)
						{
							prev = curr;
							curr = curr.next;
						}
						else
						{

							//�������ڵ��ƶ�������β��
							prev.next = curr.next;
							curr.next = null;
							new_end.next = curr;

					
							new_end = curr;

							curr = prev.next;
						}
					}
				}

				
				else prev = curr;

				//���һ���ڵ�������ʱ
				if (new_end != end && end.value %2 != 0)
				{
					prev.next = end.next;
					end.next = null;
					new_end.next = end;
				}
			return reverseList(head);
	}
	static Node reverseList(Node list){
		Node pre=null;
		Node cur=list;
		Node rev=null;
		while(cur!=null){
			Node next=cur.next;
			if(next==null)
				rev=cur;
			cur.next=pre;
			pre=cur;
			cur=next;
		}
		return rev;
	} 
		public static void main(String[] args) {
			Node head=new Node(4);
			Node node1=new Node(5);
			Node node2=new Node(7);
			Node node3=new Node(1);
			Node node4=new Node(6);
			
			head.next=node1;
			node1.next=node2;
			node2.next=node3;
			node3.next=node4;
			
			Node copy=head;
			while(copy!=null){
				System.out.print(copy.value+" ");
				copy=copy.next;
			}
			System.out.println("��ת��");
			Node rev=swap(head);
			while(rev!=null){
			System.out.print(rev.value+" ");
			rev=rev.next;
			}
		}

}
class Node {
	public Node next;
	public int value;
	public Node(int x){
		value=x;
	}
	}