import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int h=0;
        for(int i=0; i<citations.length; i++){
            h=citations.length-i;
            if(citations[i]>=h){
                System.out.println(h);
                return h;
            }
        }
        return 0;
    }
}