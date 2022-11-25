import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> hallOfFame = new ArrayList<>();
        
        hallOfFame.add(score[0]);
        answer[0] = score[0];
        
        for(int i=1; i<score.length; i++){
            if(hallOfFame.size()<k){
                hallOfFame.add(score[i]);
            }else{
                if(hallOfFame.get(0) < score[i]){
                    hallOfFame.remove(0);
                    hallOfFame.add(score[i]);
                }
            }
            hallOfFame.sort(Comparator.naturalOrder());
            answer[i] = hallOfFame.get(0);
        }
        return answer;
    }
}