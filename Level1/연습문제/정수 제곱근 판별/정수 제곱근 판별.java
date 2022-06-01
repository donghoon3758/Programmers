import java.lang.*;
import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = -1;
        long num = (long)Math.sqrt(n);
        if(Math.pow(num,2)==n){
            answer = (long)Math.pow(num+1,2);
        }
        return answer;
    }
}