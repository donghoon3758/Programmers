class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=1;
        int b=2;
        for(int i=1; i<n-1; i++){
            answer = (a+b)%1000000007;
            a=b;
            b=answer;
        }
        return answer;
    }
}