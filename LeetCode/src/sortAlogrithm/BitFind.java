package sortAlogrithm;

public class BitFind {

	//递归版本
	public static int binary_find(int[] a,int l,int r,int target){
		if(l>r)
			return -1;
		int mid=l+(r-l)/2;//直接相加可能会溢出；
		if(a[mid]>target)
			return binary_find(a, l, mid-1, target);
		if(a[mid]<target)
			return binary_find(a, mid+1, r, target);
		while(mid<=r&&a[mid]==target)
				mid++;
		return mid-1;
	}
	//while 循环版本
	public static int binary_search(int[] a,int l,int r,int target){
		while(l<r){
			int mid=l+(r-l)/2;
			if(a[mid]==target) return mid;
			if(a[mid]<target)
				l=mid+1;
			if(a[mid]>target)
				r=mid-1;
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		int[] a={1,2,5,8,8,8};
		System.out.println(binary_find(a, 0, a.length-1, 81));
	
	}
}











