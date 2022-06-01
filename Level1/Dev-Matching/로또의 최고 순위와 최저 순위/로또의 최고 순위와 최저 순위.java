import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7,7};
        int zeroCnt = 0;
        int sameCnt = 0;
        for(int i=0; i<6; i++){
            if(lottos[i]!=0){
                for(int j=0; j<6; j++){
                    if(lottos[i]==win_nums[j]){
                        sameCnt++;
                        answer[0]--;
                    }   
                }
            }
            else{
                zeroCnt++;
            }
        }
        if(zeroCnt == 0 && sameCnt != 0){
            answer[1] = answer[0];
        }else if(zeroCnt == 0 && sameCnt == 0){
            answer[0]--;
            answer[1]--;
        }
        else if(zeroCnt == 6){
            answer[0]-=zeroCnt;
            answer[1]--;
        }else{
            answer[0]-=zeroCnt; //3
            answer[1]-=sameCnt; //4
        }
        return answer;
    }
}