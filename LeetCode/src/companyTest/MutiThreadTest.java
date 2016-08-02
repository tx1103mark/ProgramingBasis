package companyTest;

public class MutiThreadTest {
	
	  public static void main(String[] args) { 
	       MutiThreadTest inc = new MutiThreadTest(); 
	       int i = 0; 
	       inc.fermin(i); 
	       i++; 
	       System.out.println(i);
	    
	    } 
	    void fermin(int i){ 
	       i++; 
	    } 
}
