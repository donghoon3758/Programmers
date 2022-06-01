import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int max = 0;
        int count = 0;
        int i = 0;
        Arrays.sort(d);
        for(i=0; i<d.length; i++){
            if(max>=budget){
                break;
            }else{
                max+=d[i];
                count++;
            }
        } 
        if(max>budget){
            count--;
        }
        answer=count;
        return answer;
    }
}