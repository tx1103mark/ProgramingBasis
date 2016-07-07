This is a DynamicProxy example
利用JDK建立动态代理实现的例子的步骤
1,定义要被代理的接口;
2,定义代理对象继承InvocationHandler,实现接口中定义的方法
public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {}
3,生成代理对象
Proxy.newProxyInstance(ClassLoader(), new Class[]{Interface.class}, InvocationHandler);
			
当执行代理对象中的方法时，会转而执行invoke中的方法。