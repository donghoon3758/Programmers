import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int turn = 0;
        String[] s = new String[words.length];
        
        for(int i=0; i<words.length; i++){
            if(i>0){
                if(!Arrays.asList(s).contains(words[i]) && words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)){
                    s[i] = words[i];
                    turn++;  
                }else{
                    break;
                }
            }else{
                s[i] = words[i];
                turn++;
            }
        }
        System.out.println(turn);
        if(words.length == turn){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = turn%n + 1;
            answer[1] = turn/n + 1;   
        }
        return answer;
    }
}