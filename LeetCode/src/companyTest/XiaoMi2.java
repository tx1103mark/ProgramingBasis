package companyTest;

import java.util.Stack;

/*
 * Ϊջ���������ֵ�ķ���,push�Ķ���int����
 */
public class XiaoMi2 extends Stack<Integer>{
	
	//���ڴ����ֵ
	Stack max=null;
	public XiaoMi2(){
		super();
		max=new Stack<Integer>();
	}
	//��������
	@Override
	public Integer push(Integer item) {
		if(!max.isEmpty()){
			if(item>(Integer)max.peek()){
				max.push(item);
			}else {
				max.push(max.peek());
			}
		}else max.push(item);
		return super.push(item);
	}
	
	@Override
	public synchronized Integer pop() {
		max.pop();
		return super.pop();
	}
	
	public Integer getMax(){
		return (Integer)max.peek();
	}

	
	public static void main(String[] args) {
		XiaoMi2 xi=new XiaoMi2();
		xi.push(1);
		xi.push(11);
		xi.push(9);
		xi.push(16);
		xi.push(8);
		System.out.println(xi.getMax());
		xi.pop();
		System.out.println(xi.getMax());
		xi.pop();
		System.out.println(xi.getMax());
		xi.pop();
		System.out.println(xi.getMax());
		
	}
}
