import java.lang.*;
import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = (Long.toString(n)).split("");
        String sumStr = "";
        Arrays.sort(str,Collections.reverseOrder());
        for(int i=0; i<str.length; i++){
            sumStr+=str[i];
        }
        answer = Long.valueOf(sumStr);
        return answer;
    }
}