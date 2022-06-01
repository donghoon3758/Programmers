import java.lang.*;
import java.util.*;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] num = new int[absolutes.length];
        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == true){
                num[i] = absolutes[i];
            }else{
                num[i] = -absolutes[i];
            }
        }
        for(int n: num){
            answer += n;
        }
        return answer;
    }
}