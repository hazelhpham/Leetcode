//string PPALLP
//loop through string
// => if ( string[i] == 'A') countA++; when countA == 2 => false ; break; 
// if (string [i] == 'L' && string[i+1) == 'L' && string[i+2]) => return false; 


class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0; 
        boolean result = true;  
        char[] c = s.toCharArray(); //put each letter of string into an array 
                                    //easier to loop through. 
        for (int i = 0; i < c.length; i++){
            if(c[i] == 'A'){
                countA++;
                if (countA == 2){
                    result = false; 
                    break; 
                }
            }
            if( (i < c.length-2) && (c[i] == 'L') && (c[i+1] == 'L') && (c[i+2] == 'L')){
            //index is always smaller than length - 2 to prevent the index out of bound error 
            //also when index > (c.length-2) and c[index] and c[index+1] == L => true. 
                result = false; 
                break;
            }
        }
        return result; 
    }
}
