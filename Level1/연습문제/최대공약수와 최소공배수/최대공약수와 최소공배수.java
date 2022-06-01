class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n,m);
        int max = Math.max(n,m);
        if(min!=0 && max!=0){
            if(max%min==0){
                answer[0]=min;
                answer[1]=max;
            }else{
                for(int i=1; i<max+1; i++){
                    if(min%i==0 && max%i==0){
                        answer[0]=i;
                    }
                }
                answer[1]=min*max/answer[0];
            }
        }else{
            answer[0]=0;
            answer[1]=0;
        }
        
        return answer;
    }
}