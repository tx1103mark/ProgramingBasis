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
	
	//原地排序版本partion函数
	public int partion4(int[] a,int left,int right){
		int base=a[right];
		int j=0;//指向小的
		for(int i=0;i<right-1;i++){
				if(a[i]<=base){
					swap(a,i,j);
					j++;
				}
		swap(a,j,right);
		}
		return j;
	}
	//递归版本
	public void quickSortRecurive(int[]a ,int start,int end){
		if(start>=end)
			return;
		int mid=a[end];
		int left=start,right=end;
		while(left<right){
			while(left<right&&a[left]<mid)
					left++;
			while(left<right&&a[right]>=mid)
				right--;
			swap(a,left,right);
		}
		if(a[left]>=a[end])
			swap(a,left,end);
		else {
//			swap(a,left,end);
			left++;
		}
		quickSortRecurive(a, start, left-1);
		quickSortRecurive(a, left+1, end);
	}
	public static void main(String[] args) {
		int[] st={1,9,2,3,7,5,6,4,4,4};
		QuickSort qs=new QuickSort();
		qs.quickSortRecurive(st, 0, st.length-1);
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	
	}
}











