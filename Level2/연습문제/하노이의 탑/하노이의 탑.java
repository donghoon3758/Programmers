import java.util.*;
class Solution {
    static ArrayList<String> list = new ArrayList<>();
    public int[][] solution(int n) {
        hanoi(n,1,3,2);
        int[][] answer = new int[list.size()][2];
        String[][] str= new String[list.size()][2];
        int i=0;
        for(String s : list){
            str[i]=s.split(" ");
            i++;
        }
        for(int k=0; k<list.size(); k++){
            for(int j=0; j<2; j++){
                answer[k][j]=Integer.parseInt(str[k][j]);
            }
        }
        return answer;
    }
    public void hanoi(int n, int from, int to, int middle){
        if(n==1){
            list.add(from+" "+to);
            return ;
        }
        hanoi(n-1,from,middle,to);
        list.add(from+" "+to);
        hanoi(n-1,middle,to,from);
    }
    
}