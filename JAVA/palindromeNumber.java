// Source : https://leetcode.com/problems/palindrome-number/
// Author : Hazel Pham
// Date   : 2020-04-13

// Description: Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//Example: 
// Input: 121
// Output: true
// Input: -121
// Output: false. From left to right, it reads -121. From right to left, it becomes 
// 121-. Therefore it is not a palindrome.




//Pseudocode:         
        //123321 
        //length : 6
        //loop 3 times : compare index[0] vs index[5] ; index[1] v index[4]; so on 
        //121
        //length : 3
        //loop 1 time        
        //123454321
        //length: 9 
        //loop 4 times: compare index[0] vs index[8] ; index[1] v index[7]; so on 
        //Convert from integer to string 
        //=> Length is odd : loop : ((length - 1)/2) times. Break the loop if false. 
        //=> Length is even: loop (length / 2) times. Break the loop if false.
        // If it's a one digit number => automatically true. 
        
class Solution {
    public boolean isPalindrome(int x) {


        boolean result = false;
        String s = String.valueOf(x);
        int length = s.length();
        if(length == 1){
            result = true; 
        }
        else if((length%2) !=0){
            for(int i = 0; i < ((length-1)/2); i++){
                if(s.charAt(i) == s.charAt(length-1-i)){
                    result = true; 
                }
                else{
                    result = false;
                    break;
                }
            }
        }

        else if((length%2)==0){
            for(int i =0; i < (length/2); i++){
                if(s.charAt(i) == s.charAt(length-1-i)){
                    result = true; 
                }
                else{
                    result = false; 
                    break;
                }
            }
        }
        
        return result;
            
    }
}
