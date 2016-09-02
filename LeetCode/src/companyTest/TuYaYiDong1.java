package companyTest;


public class TuYaYiDong1 {

		static int getMinSquares(int n)
		{
			
			if (n <= 3)
				return n;
		
			int res = n; 
		
			
			for (int x = 1; x <= (int) Math.sqrt(n); x++)
			{
				int temp = x*x;
				res = Math.min(res, 1+getMinSquares(n - temp));
			}
			return res;
		}
		public static void main(String args[])
		{
		System.out.println(getMinSquares(16));
		System.out.println(getMinSquares(13));
		}

}
