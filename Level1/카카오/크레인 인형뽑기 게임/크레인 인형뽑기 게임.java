import java.lang.*;
import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dolls = new Stack<>();
        
        for(int index : moves){
            for(int i=0; i<board.length;i++){
                if(board[i][index-1]!=0){
                    if(dolls.isEmpty()){
                        dolls.push(board[i][index-1]);
                    }else if(dolls.peek() == board[i][index-1]){
                        dolls.pop();
                        answer+=2;
                    }else{
                        dolls.push(board[i][index-1]);
                    }
                    board[i][index-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}