package sortAlogrithm;

public class HeapSort {

	//Sink算法,维护最大堆的性质
	public void Sink(int[] a,int root,int heapSize){
		int leftChild=2*root+1;
		int rightChild=2*root+2;
		int max=root;
		if(leftChild<heapSize&&a[leftChild]>a[root])
			max=leftChild;
		if(rightChild<heapSize&&a[rightChild]>a[max])
			max=rightChild;
		if(max!=root){
			swap(a,root,max);
			Sink(a,max,heapSize);
		}
	}
	
	public void buildHeap(int[] a){
		for(int i=a.length/2;i>=0;i--)
			Sink(a, i,a.length);
	}

	public void heapSort(int[] a){
		buildHeap(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("he");
		for(int i=a.length-1;i>0;i--){
			swap(a,0,i);
			Sink(a,0,i);
		}
	}
	
	public void swap(int[] st,int i,int j){
		int temp=st[i];
		st[i]=st[j];
		st[j]=temp;
	}
	
	
	public static void main(String[] args) {
		int[] a={2,4};
		HeapSort ms=new HeapSort();
		ms.heapSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
	}
}











