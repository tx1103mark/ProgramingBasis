package cracking_the_coding_interview;
/*
 * 给定一个string iniString，请返回一个bool值,
 * True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
 */
public class nowCode1 {

	  public static boolean checkDifferent(String iniString) {
	        // write code here
		  boolean[] isLive=new boolean[256];
		  char[] sts=iniString.toCharArray();
		  for(int i=0;i<sts.length;i++)
			  if(isLive[(int)sts[i]]==true)
				  return false;
			  else {
				  isLive[(int)iniString.charAt(i)]=true;
			}
				  return true;
				  
	    }
	  
	  public static void main(String[] args) {
		System.out.println(checkDifferent("acbdbesy"));
	}
}
