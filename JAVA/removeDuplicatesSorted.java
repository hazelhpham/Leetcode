//Author : Hazel Pham 
//Date : April 15th 2020
// Source: https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 
//Description: Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.


class Solution {
    public int removeDuplicates(int[] nums) {
        
/* 
- Pseudocode: 
    if length of an array = 0 => return 0
    loop from j = 1; i=0 : if arr[i] == arr[j] => keep i and increase j=j+1
                           else increase i=i+1. the loop continues 
*/
 
    int length = nums.length;
    if(length == 0 ) return 0;
    int i = 0;
    for (int j = 1; j<length; j++){
        if(nums[j] == nums[i]){
               continue;
        }    
        nums[++i] = nums[j];
        
    }    
    return i+1;
        
    }
}
