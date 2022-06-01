class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n!=0){
            for(int i=1; i<n; i++){
                if(n%i==1){
                    answer = i;
                    break;
                }
            }   
        }else{
            answer=0;
        }
        return answer;
    }
}