package backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/combinations/
 * n个数里面取k个数
 */
public class Solution77Combinations {
	
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);
		return combs;
	}
	public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
		if(k==0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}
		for(int i=start;i<=n;i++) {
			comb.add(i);
			combine(combs, comb, i+1, n, k-1);
			comb.remove(comb.size()-1);
	
		}
	}
	public static void main(String[] args) {
		List<Integer> te=new ArrayList<Integer>();
		te.add(1);
		te.add(2);
		te.add(3);
		System.out.println(te);
		te.remove(te.size()-1);
		System.out.println(te);
	}
}
