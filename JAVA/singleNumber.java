//Author : Hazel Pham
//Source: https://leetcode.com/problems/single-number/
//Description: Given a non-empty array of integers, every element appears twice except for one. Find that single one


/*
- Create a new list. 
- Iterate through the numbers in array nums: 
    + If that number is completely new to the list, add to the list 
    + Else if the number is already in the list, remove from the list. 
- After removing all the duplicates from the list, the only remaining number is the result.  
*/
class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> list_no_duplicate = new ArrayList<>();
        
        for(int i : nums){
            if(list_no_duplicate.contains(i) == false){
                list_no_duplicate.add(i);
            }
            else{
                list_no_duplicate.remove(new Integer(i));
            }
        }
        return list_no_duplicate.get(0); 
}
}
