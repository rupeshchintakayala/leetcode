/*
Problem Statement:
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
*/

class Solution {

    public boolean isAnagram(String s, String t) {
        // if length of strings are not equal, then one string is not an anagram of other
        if(s.length()!=t.length()) return false;

        // create an integer array to count the frequencies of characters in each string
        int[] count = new int[26];

        // increment the count for char in one string and decrement the count for the char in other string
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        // all the values should be 0 (zero), if one string is an anagram of other
        for(int j:count){
            if(j!=0) return false;
        }

        return true;
    }
}
