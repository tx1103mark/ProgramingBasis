package sortAlogrithm;

public class QuickSort {

	//parition�㷨
	public int parition(int[] a,int left,int right,int base){
		//����׼���ƶ������ұ�
				int baseValue=a[base];
				swap(a, right, base);
				int index=left; //���ó�ʼ��׼λ��index
				for(int i=left;i<=right-1;i++)
					if(a[i]<baseValue){
						swap(a, index,i);
						index=index+1;
					}
					swap(a, right, index);
					return index;
		}
	
	
	public void swap(int[] st,int i,int j){
		int temp=st[i];
		st[i]=st[j];
		st[j]=temp;
	}
	
	public void quickSort(int[] st,int left,int right){
		if(left<right){
		int index=parition(st, left, right, left);
		//System.out.println(index);
		quickSort(st, left, index-1);
		quickSort(st, index+1, right);
		}
	}
	
	public static void main(String[] args) {
		int[] st={1,9,2,3,7};
		QuickSort qs=new QuickSort();
		qs.quickSort(st, 0, st.length-1);
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	
	}
}
