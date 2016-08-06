package companyTest;


public class MutiThreadTest {
	static String result="";
	  public static void main(String[] args) { 
	  Method(1);
	  Method(0);
	  System.out.println(result);
	    } 
	  static void Method(int i){
		  try {
			if(i==1)
				throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			result+="2";
			return;
		}finally{
			result+="3";
		}
		  result+="4";
	  }
}
