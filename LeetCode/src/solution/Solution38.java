package solution;

/*
38. Count and Say  QuestionEditorial Solution  My Submissions
Total Accepted: 91469
Total Submissions: 301112
Difficulty: Easy
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string
*/



public class Solution38 {
	
	
//	  public static String countAndSay(int n) {
//		  StringBuffer s = new StringBuffer("1");
//	        StringBuffer res = new StringBuffer();
//	        while((--n) != 0){
//	            res.setLength(0);
//	            int size = s.length();
//	            int cnt = 1;
//	            char cur = s.charAt(0);
//	            for(int i=1;i<size;i++){
//	                if(s.charAt(i)!=cur){
//	                    res.append(cnt);
//	                    res.append(cur);
//	                    cur = s.charAt(i);
//	                    cnt = 1;
//	                }else ++cnt;
//	            }
//	            res.append(cnt);
//	            res.append(cur);
//	            StringBuffer tmp = s;
//	            s = res;
//	            res = tmp;
//	        }
//	        
//	        return s.toString();  
//	    }
	  public static String countAndSay(int n){
		  if(n==1)
			  return "1";
		  String per=countAndSay(n-1);
		  StringBuilder sb=new StringBuilder();
		 
		  for(int i=0;i<per.length();i++){
			char base=per.charAt(i);
			 int count=1;
			  while(i<per.length()-1&&per.charAt(++i)==base){
				  count++;
			  }
			  if(per.charAt(i)!=base)
				  i--;
			  sb.append(count);
			  sb.append(base);
		  }
		  return sb.toString();
	  }
	  //×Ö´®²éÕÒ
	  public static int strStr(String haystack, String needle) {
		   int length=needle.length();
	        for(int i=0;i<haystack.length()-needle.length()+1;i++){
	        	if(haystack.substring(i, i+length).equals(needle))
	        		return i;
	        }
	         return -1;
	    }
	  
	  
	  public static void main(String[] args) {
		  System.out.println(strStr("hello", "lo"));
//		System.out.println(countAndSay(7));
	}

	 
}
