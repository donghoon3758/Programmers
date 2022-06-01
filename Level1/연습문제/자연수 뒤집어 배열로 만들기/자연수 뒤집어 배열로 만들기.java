import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String[] str = (Long.toString(n)).split("");
        answer = new int[str.length];
        for(int i=0; i<str.length; i++){
            answer[i] = (int)(n%10);
            n/=10;
            System.out.print(answer[i]);
        }
        return answer;
    }
}