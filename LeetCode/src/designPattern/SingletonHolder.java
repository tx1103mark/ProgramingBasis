package designPattern;

public class SingletonHolder {
	
	
	private SingletonHolder(){
		
	}
	private static class inner{
		private static SingletonHolder sh=new SingletonHolder();
 	}
	public static SingletonHolder getInstance(){
		return inner.sh;
	}
	
	public static void main(String[] args) {
		SingletonHolder st=getInstance();
	}
}
