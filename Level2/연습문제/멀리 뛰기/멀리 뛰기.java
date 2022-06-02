class Solution {
    public long solution(int n) {
        long answer = 0;
        long a = 1;
        long b = 2;
        for(int i=1; i<n-1; i++){
            answer=(a+b)%1234567;
            a=b;
            b=answer;
        }
        if(n==1){
            answer=1;
        }else if(n==2){
            answer=2;
        }
        return answer;
    }
}