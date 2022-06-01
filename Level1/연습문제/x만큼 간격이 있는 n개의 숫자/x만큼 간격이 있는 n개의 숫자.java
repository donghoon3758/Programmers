import java.lang.*;
import java.util.*;
class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        ArrayList<Long> list = new ArrayList<>();
        long a=x;
        int j=0;
        while(j<n){
            list.add(Long.valueOf(x));
            x+=a;
            j++;
        }
        for(int i=0; i<n; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}