package nowCoder;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int[] arr=new int[a];
            for(int i=0;i<a;i++)
            	arr[i]=in.nextInt();
            
            System.out.println(MaxSub(arr));
        }
    }
	
	public static int MaxSub(int[] a){
		 if(a.length>0){
				int currSum = 0;
			    int maxSum = a[0];       //全负情况，返回最大数

			    for (int j = 0; j < a.length; j++)
			    {
			        currSum = (a[j] > currSum + a[j]) ? a[j] : currSum + a[j];
			        maxSum = (maxSum > currSum) ? maxSum : currSum;

			    }
			    return maxSum;
				}else return 0;
	}
	
	static int max(int x, int y)
{
    return (x > y) ? x : y;
}

static int maxSum2(int[] A, int n)
{
    int i;
    int[] All=new int[n];
    int[]Start=new int[n];
    
    All[n-1] = A[n-1];
    Start[n-1] = A[n-1];
    
    for(i = n-2; i >= 0; i--)
    {
          Start[i] = max(A[i], A[i]+Start[i+1]);
          All[i] = max(All[i+1], Start[i]);
    }
    
    return All[0];    
}
	
}
