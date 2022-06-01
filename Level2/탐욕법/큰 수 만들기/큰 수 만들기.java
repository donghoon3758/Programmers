import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String number, int k) {
        int index=0;
        int max =0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<number.length()-k; i++){
            max =0;
            for(int j=index; j<i+k+1; j++){
                if(max<number.charAt(j)-'0'){
                    max=number.charAt(j)-'0';
                    index=j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}