package sortAlogrithm;

public class MergeSort {

	//MergeËã·¨
	public void MergeArrays(int[] a,int left,int mid,int right){
		if(left>=right)
			return;
		int[] b=new int[right-left+1];
		int i=left;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=right){
			if(a[i]<a[j])
				b[k++]=a[i++];
			else b[k++]=a[j++];
		}
		while(i<=mid)
			b[k++]=a[i++];
		while(j<=right)
			b[k++]=a[j++];
		for(i=0;i<k;i++){			a[i+left]=b[i];}

			
	}
	
	
	public void swap(int[] st,int i,int j){
		int temp=st[i];
		st[i]=st[j];
		st[j]=temp;
	}
	
	public void mergeSort(int[] a,int left,int right){
		
		if(left<right){
		int mid=(left+right)/2;
		mergeSort(a,left,mid);
		mergeSort(a,mid+1,right);
		MergeArrays(a, left, mid, right);
		}
	}
	public static void main(String[] args) {
		int[] a={1,9,2,3,7,5,6,4,4,4};
		MergeSort ms=new MergeSort();
		ms.mergeSort(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
	}
}











