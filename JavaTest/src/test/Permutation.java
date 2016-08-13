package test;

import java.util.HashSet;

public class Permutation {
	
	static int count=0;
	//求字符串的全排列
	public void FullSort(String s){
		char[] st=s.toCharArray();
	
		FullSort(st, 0);
			
		
	}
	public void FullSort(char[] st,int start){
		
		if(start==st.length-1){
	//		System.out.println(st);
			System.out.println(count++);
		}
		for(int i=start;i<st.length;i++){
			swap(start,i,st);
			FullSort(st,start+1);
			swap(start,i,st);
		}
		
	}
	
	public void swap(int i,int j,char[] st){
		char temp=st[i];
		st[i]=st[j];
		st[j]=temp;
	}
	
	public static void main(String[] args) {
		
		
		Permutation per=new Permutation();
		per.FullSort("abcde");
	}
}
