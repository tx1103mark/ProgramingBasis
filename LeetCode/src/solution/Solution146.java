package solution;

import java.util.Iterator;
import java.util.LinkedHashMap;

/*
146. LRU Cache  QuestionEditorial Solution  My Submissions
Total Accepted: 83749
Total Submissions: 528366
Difficulty: Hard
Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and set.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.
*/



public class Solution146 {
	public class LRUCache{
		LinkedHashMap<Integer, Integer> sh;

	 public  LRUCache(int capacity) {
	        sh=new LinkedHashMap<Integer, Integer>(capacity,0.75f,true){
	        	
	        	@Override
	        	protected boolean removeEldestEntry(
	        			java.util.Map.Entry<Integer, Integer> eldest) {
	        		
	        		return size()>capacity;
	        	}
	        };
	     
	    }
	    
	    public int get(int key) {
	      if(sh.get(key)!=null){
	      		return sh.get(key);
	      }
	      else return -1;
	    }
	    
	    public void set(int key, int value) {
	        	sh.put(key, value);
	    }
	    
	    public void moveToFront(int key){
	    	int val=sh.get(key);
	    	sh.remove(key);
	    	sh.put(key, val);
	    }
	}

	public static void main(String[] args) {
		LRUCache lr=new Solution146().new LRUCache(2);
		lr.set(2, 1);
		lr.set(1, 1);
		System.out.println(lr.get(2));
		lr.set(4, 1);
		System.out.println(lr.get(4));
		System.out.println(lr.get(1));
		
	}
}

