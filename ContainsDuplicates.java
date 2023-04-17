/*
Problem Statement:
217. Contains Duplicates
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        /*
        Solution 1: O(n2)
        Comparing all the elements with each other for duplicates,
        if a match is found, set the flag as true,
        else return false.
        */

        // int len = nums.length;
        // boolean flag = false;
        // for (int i=0;i<len;i++){
        //     for(int j=1;j<len;j++){
        //         if(i!=j){
        //             if(nums[i]==nums[j]){
        //                 flag = true;
        //             }
        //         }
        //     }
        // }
        // Arrays.sort(nums);
        // for (int i=0;i<len-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         flag = true;
        //     }
        // }
        // return flag;

        /*
        Solution 1: O(n)
        Store the elements in a Hashsetcheck ,
        while adding a new integer check if it already exists in the set:
        if it contains, return true,
        else return false.
        */

        Set<Integer> numbers = new HashSet<Integer>();
        for(int i: nums){
            if(numbers.contains(i)){
                return true;
            }
            numbers.add(i);
        }
        return false;
    }
}