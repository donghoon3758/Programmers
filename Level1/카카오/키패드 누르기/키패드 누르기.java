import java.lang.*;
import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        
        for(int number : numbers){
            if(number == 1 || number == 4 || number == 7){
                answer += "L";
                left = number;
            }else if(number == 3 || number == 6 || number == 9){
                answer += "R";
                right = number;
            }else{
                if(number == 0){
                    number = 11;
                }
                int leftDistance = (Math.abs(left-number))%3+(Math.abs(left-number))/3;
                int rightDistance = (Math.abs(right-number))%3+(Math.abs(right-number))/3;
                if(leftDistance == rightDistance){
                    if(hand.equals("left")){
                        answer += "L";
                        left = number;
                    }else{
                        answer += "R";
                        right = number;
                    }
                }else if(leftDistance > rightDistance){
                    answer += "R";
                    right = number;
                }else{
                    answer += "L";
                    left = number;
                }
            }
            
        }
        return answer;
    }
}