import java.lang.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int binaryCnt = 0;
        
        while(!s.equals("1")){
            int oneCnt = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){
                    zeroCnt++;
                }else{
                    oneCnt++;
                }
            }
            s = Integer.toBinaryString(oneCnt);
            binaryCnt++;
        }
        answer[0] = binaryCnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}