This is a DynamicProxy example
����JDK������̬����ʵ�ֵ����ӵĲ���
1,����Ҫ������Ľӿ�;
2,����������̳�InvocationHandler,ʵ�ֽӿ��ж���ķ���
public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {}
3,���ɴ������
Proxy.newProxyInstance(ClassLoader(), new Class[]{Interface.class}, InvocationHandler);
			
��ִ�д�������еķ���ʱ����ת��ִ��invoke�еķ�����