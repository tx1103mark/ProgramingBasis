package companyTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
http://www.nowcoder.com/test/question/5a0a2c7e431e4fbbbb1ff32ac6e8dfa0?pid=2385858&tid=4751390 * 
 */
public class NowCoder {
	
	public static void main(String[] args) {
		List<int[]> result=new ArrayList<int[]>();
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		while(count>0){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] paper=new int[2*n];
			for(int i=0;i<2*n;i++)
					paper[i]=sc.nextInt();
			result.add(chuli(paper,n,k));
			
			count--;
		}
		for(Iterator<int[]> a=result.iterator();a.hasNext();){
			int[] b=a.next();
			for(int i=0;i<b.length-1;i++)
			System.out.print(b[i]+" ");
			System.out.println(b[b.length-1]);
		}
	}
	
	public static int[] chuli(int[] a,int n,int k){
		
		while(k-->0){
			int[] copy=new int[2*n];
		for(int i=0,j=0;i<n;i++){
			copy[j++]=a[i];
			copy[j++]=a[i+n];
		}
			a=copy;
		}
	return a;
	}
	
//	public static void main(String[] args) {
//		int[] a={1,1,1,1};
//		a=chuli(a,2,2);
//		for(int i:a)
//			System.out.println(i);
//	}
	
}
