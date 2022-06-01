import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        int value = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=value){
                list.add(arr[i]);
                value = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}