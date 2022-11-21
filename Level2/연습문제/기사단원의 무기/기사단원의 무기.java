import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        ArrayList<Integer> cntList = new ArrayList<>();
        for(int i=1;i<number+1; i++){
            cntList.add(count(i));
        }
        for(int i=0; i<number; i++){
            if(cntList.get(i) > limit){
                answer += power;
            }else{
                answer += cntList.get(i);
            }
        }
        return answer;
    }
    public int count(int num){
        int cnt = 0;
        for(int i=1; i<=Math.sqrt(num); i++){
            if(i*i == num){
                cnt++;
            }else if(num%i == 0){
                cnt+=2;
            }
        }
        return cnt;
    }
}