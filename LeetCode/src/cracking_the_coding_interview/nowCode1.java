package cracking_the_coding_interview;
/*
 * ����һ��string iniString���뷵��һ��boolֵ,
 * True���������ַ�ȫ����ͬ��False���������ͬ���ַ�����֤�ַ����е��ַ�ΪASCII�ַ����ַ����ĳ���С�ڵ���3000��
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
