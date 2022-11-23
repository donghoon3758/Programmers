class Solution {
    public int[] solution(long begin, long end){
        int[] answer = new int[(int)end-(int)begin+1];
        
        for(int i =(int)begin; i<(int)end+1; i++){
            answer[i-(int)begin] = 1;
            
            for(int j=2; j<=Math.floor(Math.sqrt(i)); j++){
                if(i%j==0 && i/j<=10000000){
                    answer[i-(int)begin] = i/j;
                    break;
                }
            }
        }
        if((int)begin == 1){
            answer[0] = 0;
        }
        return answer;
    }
}