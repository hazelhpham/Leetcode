class Solution {
    public int removeDuplicates(int[] nums) {

/*
Question 1: i can return the new length simply by : nếu chỉ cần return lại đúng length như method cần => dùng if số thứ i và số i+1 giống nhau => length-1;
Submit xong lại không đúng, mặc dù length đúng. 
Ví dụ :  
Question 2: how the fuck can i remove the duplicates? I thought of putting all                  numbers of the array into an array list
            or a vector which has the remove method already. 
*/
/*But lets try this new method i just learnt!!!! 
With this method, i can get the length.
Pseudocode: 
    1st: if length == 0 => return 0 
    pointer = 1;  
    original = 0; 
    loop starting from index 1 : 
    if(nums[original]!= nums[index1]): 
       move the position of original to [index1] 
       nums[pointer] = nums[index1]
       pointer++; 
    *note: else: i+1 ; OG giữ nguyên; pointer giữ nguyên
    
    return pointer; 
*/
        
/* The idea is that ++a increments a and returns that value, while a++ returns a's value and then increments a.*/
/*        
    int length = nums.length;
    if(length == 0 ) return 0;
    
    int original = nums[0];
    int pointer = 1;
    
    for(int i = 1; i<length; i++){
        if( nums[i] != original ){
            original = nums[i]; //có nghĩa original sẽ bằng 3?! 
            nums[pointer] = nums[i]; //
            pointer++;
        }
    }
        return pointer; 
*/
//OKAY the key of this exercise is: if arr[i] == arr[j] => you keep i and increase j.          
    int length = nums.length;
    if(length == 0 ) return 0;
    int i = 0;
    for (int j = 1; j<length; j++){
        if(nums[j] == nums[i])
               continue; 
        nums[++i] = nums[j];
        
    }    
    return i+1;
        
    }
}
