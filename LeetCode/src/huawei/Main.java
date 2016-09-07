package huawei;


import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s=input.nextLine();
    int a=0;
    int b=0;
    int c=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='(')a++;
      if(s.charAt(i)==')')a--;
      if(s.charAt(i)=='{')b++;
      if(s.charAt(i)=='}')b--;
      if(s.charAt(i)=='[')c++;
      if(s.charAt(i)==']')c--;
      if(a<0||b<0||c<0){
        System.out.println("false");return;
      }
    }
    if(a!=0||b!=0||c!=0){System.out.println("false");return;}
    System.out.println("true");
  }
}