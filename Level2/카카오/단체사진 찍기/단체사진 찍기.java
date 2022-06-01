import java.util.*;
class Solution {
    static int position[];
    static boolean check[];
    HashMap<Character, Integer> map;
    static int answer;
    public int solution(int n, String[] data) {
        answer = 0;
        position = new int[8];
        check = new boolean[8];
        map = new HashMap<>();
        map.put('A',0);
        map.put('C',1);
        map.put('F',2);
        map.put('J',3);
        map.put('M',4);
        map.put('N',5);
        map.put('R',6);
        map.put('T',7);
        dfs(0, data);
        return answer;
    }
    public void dfs(int index, String[] data){
        if(index==8){
            if(isTrue(data)){
                answer++;
            }
        }
        for(int i=0; i<8; i++){
            if(!check[i]){
                check[i]=true;
                position[index] = i;
                dfs(index+1, data);
                check[i]=false;
            }  
        }
    }
    public boolean isTrue(String[] data){
        for(String s : data){
            int index1 = position[map.get(s.charAt(0))];
            int index2 = position[map.get(s.charAt(2))];
            char op = s.charAt(3);
            int num = s.charAt(4)-'0';
            
            if(op=='='){
                if(Math.abs(index1-index2)-1 != num){
                    return false;
                }
            }else if(op == '>'){
                if(Math.abs(index1-index2)-1 <= num){
                    return false;
                }
            }else{
                if(Math.abs(index1-index2)-1 >= num){
                    return false;
                }
            }
        }
        return true;
    }
}