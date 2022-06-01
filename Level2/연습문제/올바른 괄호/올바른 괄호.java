import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int open =0;
        Queue<String> q = new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            q.add(s.substring(i,i+1));
        }
        
        while(!q.isEmpty()){
            String str = q.poll();
            if(str.equals(")") && open==0){
                return false;
            }
            if(str.equals("(")){
                open++;
            }else{
                open--;
            }
        }
        if(open!=0){
            answer=false;
        }else{
            answer=true;
        }
        return answer;
    }
}