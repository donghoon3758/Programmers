import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int j=0;
        for(int i=people.length-1; j<=i; i--){
            if(people[j]+people[i]<=limit){
                j++;
            }
            answer++;
        }
        return answer;
    }
}