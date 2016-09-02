package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import solution.Solution143.ListNode;

/*
138. Copy List with Random Pointer  QuestionEditorial Solution  My Submissions
Total Accepted: 72055
Total Submissions: 275229
Difficulty: Hard
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

Subscribe to see which companies asked this question
*/



public class Solution138 {
	class RandomListNode {
		    private  int label;
		     RandomListNode next, random;
		     RandomListNode(int x) { this.label = x; }}
	  
	  public RandomListNode copyRandomList(RandomListNode head) {
	        RandomListNode node=new RandomListNode(1);
	        System.out.println(node.label);
	        return node;
	    }
}

