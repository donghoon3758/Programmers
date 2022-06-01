import java.util.*;
import java.lang.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int maxV=0;
        int maxH=0;
        for(int i =0; i<sizes.length; i++){
            int v = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            maxV = Math.max(maxV,v);
            maxH = Math.max(maxH,h);
        }
        System.out.print(maxV);
        System.out.print(maxH);
        answer = maxV*maxH;
        return answer;
    }
}