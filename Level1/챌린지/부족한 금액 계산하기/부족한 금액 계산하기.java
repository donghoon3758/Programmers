import java.lang.*;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        int j=1;
        long sum=0;
        for(int i=0; i<count; i++){
            sum += price*j;
            j++;
        }
        if(sum>money){
            answer =sum-money;    
        }else{
            answer=0;
        }
        
        return answer;
    }
}