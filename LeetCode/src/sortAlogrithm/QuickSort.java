package sortAlogrithm;

public class QuickSort {

	//parition算法
	public int parition(int[] a,int left,int right,int base){
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
	
	
	public int partion2(int[] a,int left,int right){
		int base=a[right];
		int index=left;
		for(int i=left;i<right;i++)
			if(a[i]<base){
				swap(a, index, i);
				index++;
			}
			swap(a, index, right);	
			return index;
	}
	
	public int partion3(int[] a,int left,int right){
		int base=a[left];
		int i=left;
		left++;
		while(left<right){
			while(left<right&&a[left]<base)
				left++;
			if(left<right){
				swap(a, left, right);
				right--;
			}
				
			while(left<right&&a[right]>=base)
				right--;	
			if(left<right){
				swap(a, left, right);
				left++;
			}
		}
		swap(a, i, left);
		return left;
	}
	
	
	public void sort(int[] a,int left,int right){
		if(left<right){
			int index=partion2(a, left, right);
			sort(a, left, index-1);
			sort(a, index+1, right);
		}
	}
	
	public static void main(String[] args) {
		int[] st={1,9,2,3,7};
		QuickSort qs=new QuickSort();
		qs.sort(st, 0, st.length-1);
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	
	}
}
