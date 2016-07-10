/*
 Author:     Andy, nkuwjg@gmail.com
 Date:       Dec 25, 2014
 Problem:    Length of Last Word
 Difficulty: Easy
 Source:     https://oj.leetcode.com/problems/length-of-last-word/
 Notes:
 Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 If the last word does not exist, return 0.
 Note: A word is defined as a character sequence consists of non-space characters only.
 For example, 
 Given s = "Hello World",
 return 5.

 Solution: ...
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int res = 0, i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') --i;
        while (i >= 0 && s.charAt(i) != ' ') {
            --i; ++res;
        }
        return res;
    }
}