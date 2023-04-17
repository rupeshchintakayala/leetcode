/*
Problem Statement:
1. Two Sum
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /*
        Solution 1: O(n2)
        Comparing sum of combination of different elements with target,
        if a match is found, return the indicies,
        there's no else case as we have exactly one solution.
        */

        // int result[] = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(i!=j){
        //             if(nums[i]+nums[j]==target){
        //                 result[0]=i;
        //                 result[1]=j;
        //             }
        //         }
        //     }
        // }
        // return result;

        /*
        Solution 2: O(n)
        HashMap for the current integer and different between the current integer and the target.
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(num, i);
        }
        return new int[] {};
    }
}