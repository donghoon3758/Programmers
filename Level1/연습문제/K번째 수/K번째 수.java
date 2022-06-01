import java.lang.*;
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer =new int[commands.length];
        int[] arr = {};
        int cnt = 0;
        for(int[] cmd : commands){
            List<Integer> list = new ArrayList<Integer>();
            for(int i=cmd[0]-1; i<cmd[1];i++){
                list.add(array[i]);
            }
            System.out.println(list);
            arr = list.stream().mapToInt(i->i).toArray();
            Arrays.sort(arr);
            answer[cnt]= arr[cmd[2]-1];
            cnt++;
            
        }
        return answer;
    }
}