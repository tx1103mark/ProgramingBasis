package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyTest implements InvocationHandler{

	public Object ProxyObject;
	public ProxyTest(Object ProxyObject){
		this.ProxyObject=ProxyObject;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("befor");
		
	method.invoke(ProxyObject, args);
	
	System.out.println("after");
	return null;
		
	}
	
	public static void main(String[] args) {
		SubjectImp a1=new SubjectImp();
		Subject sub=(Subject)Proxy.newProxyInstance(SubjectImp.class.getClassLoader(), new Class[]{Subject.class}, new ProxyTest(a1));
		sub.doSomething();
	}

	
}
