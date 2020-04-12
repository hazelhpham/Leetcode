//Source: https://leetcode.com/problems/two-sum/
//Author : Hazel Pham
// Date   : 2020-04-03

//Description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Given nums = [2, 7, 11, 15], target = 9,
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0 ;  i < nums.length; i++){
            for(int j = i+1; j < nums.length;j++){
                if(target - nums[i] == nums[j]){
                   return new int[] {i,j};
                }
            
            }
        } 
    
        }
   
}