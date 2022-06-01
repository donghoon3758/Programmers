import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int firstCnt = 0;
        int secondCnt = 0;
        int thirdCnt = 0;

        for(int i = 0; i<answers.length; i++){
            if(first[i%first.length]==answers[i]){
                firstCnt++;
            }
            if(second[i%second.length]==answers[i]){
                secondCnt++;
            }
            if(third[i%third.length]==answers[i]){
                thirdCnt++;
            }
        } 
        int max = Math.max(Math.max(firstCnt,secondCnt),thirdCnt);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == firstCnt){
            list.add(1);
        }
        if(max == secondCnt){
            list.add(2);
        }
        if(max == thirdCnt){
            list.add(3);
        }
        answer = new int[list.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}