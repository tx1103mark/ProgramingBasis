package companyTest;

import java.util.Arrays;

public class Finder {
	
	public int findKth(int[] a, int n, int K) {
		
//		Arrays.sort(a);
//		System.out.println(a[n-K]);
        // write code here
		int left=0;int right=n-1;

		return a[qucikSort(a, left, right, n-K)];
		
			
    }
	public int qucikSort(int[] a,int left,int right,int targetIndex){
		if(right>left){
			int index=partion(a, left, right,left);
			if(index==targetIndex) 
				return index;
			else if(index>targetIndex)
				return qucikSort(a, left, index-1,targetIndex);
			else 
				return qucikSort(a, index+1, right,targetIndex);
		}		
		return -1;
	} 
	
	public int partion(int[] a,int left,int right,int base){
		//将基准数移动到最右边
		int baseValue=a[base];
		swap(a, right, base);
		int index=left; //设置初始基准位置index
		for(int i=left;i<=right-1;i++)
			if(a[i]<baseValue){
				swap(a, index,i);
				index=index+1;
			}
			swap(a, right, index);
			return index;
	}
	public void swap(int[] a,int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args) {
		Finder fin=new Finder();
		int[] a={1332802,1177178,1514891,871248,753214,123866,1615405,328656,1540395,968891,1884022,252932,1034406,1455178,821713,486232,860175,1896237,852300,566715,1285209,1845742,883142,259266,520911,1844960,218188,1528217,332380,261485,1111670,16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,190970,48715,349690,673887,1648782,1010556,1165786,937247,986578,798663};
		System.err.println(fin.findKth(a, a.length, 24));;
		
	}
}
