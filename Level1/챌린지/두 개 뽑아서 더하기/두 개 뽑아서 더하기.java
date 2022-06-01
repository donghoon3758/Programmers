import java.util.*;
import java.lang.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            if(i+1>=numbers.length){
                break;
            }
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        answer = new int[set.size()];
        int i=0;
        for(Integer value : set){
            answer[i++] = value;
        }
        Arrays.sort(answer);
        return answer;
    }
}