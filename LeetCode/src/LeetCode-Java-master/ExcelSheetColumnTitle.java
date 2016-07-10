/*
 Author:     King, wangjingui@outlook.com
 Date:       Dec 19, 2014
 Problem:    Excel Sheet Column Title 
 Difficulty: Easy
 Source:     https://oj.leetcode.com/problems/excel-sheet-column-title/
 Notes:
 Given a non-zero positive integer, return its corresponding column title as appear in an Excel sheet.

 For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

 Solution: 1. Iteration.
           2&3. recursion.
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            sb.insert(0,(char)((n - 1)%26 + 'A'));
            n  = (n - 1) / 26;
        }
        return sb.toString();
    }
}
