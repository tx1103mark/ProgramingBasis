package companyTest;

import java.util.Stack;

/*
 * 为栈增加求最大值的方法,push的都是int类型
 */
public class XiaoMi2 extends Stack<Integer>{
	
	//用于存最大值
	Stack max=null;
	public XiaoMi2(){
		super();
		max=new Stack<Integer>();
	}
	//基本操作
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
