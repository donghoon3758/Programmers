import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        ArrayList<Integer> list = new ArrayList<>();
        int row=0;
        int col=0;
        for(int i=1; i<yellow+1; i++){
            if(yellow%i==0){
                list.add(i);
            }
        }
        int i=0;
        while(brown!=row*2+col*2+4 && i<list.size()){
            col=list.get(i);
            row=list.get(list.size()-(i+1));
            i++;
        }
        answer[0]=row+2;
        answer[1]=col+2;
        return answer;
    }
}