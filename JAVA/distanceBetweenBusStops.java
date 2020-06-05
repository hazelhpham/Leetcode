/*
Author : Hazel Pham 
Source: https://leetcode.com/problems/distance-between-bus-stops/
*/

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
    int result_clockwise = 0;
    int result_counterClockwise = 0; 
    int result = 0; 
    int sum = 0;
    int temp = 0; 
//swap if user input start position > final position
    if(start > destination){
        temp = start;
        start = destination;
        destination = temp;
    }
//to calculate the distance clockwise
        for (int i = start; i < destination; i++){
            result_clockwise = result_clockwise + distance[i];
        }
//calculate the distance from the start position to the final destination of the route
        for (int i = 0; i<distance.length;i++){
            sum = sum + distance[i];
        }
// => the counter-clockwise route = total - clockwise route 
        result_counterClockwise = sum - result_clockwise;

//compare the clockwise distance vs counter-clockwise distance
        if(result_clockwise > result_counterClockwise   ){
            result = result_counterClockwise; 
        }
        else if (result_clockwise < result_counterClockwise   ){
            result = result_clockwise; 
        }
        
    return result;
    }
}
