class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canBabbling = {"aya", "ye", "woo", "ma"};
        String[] continousBabbling = {"ayaaya", "yeye", "woowoo", "mama"};
        for(String s : babbling){
            for(String repeat : continousBabbling){
                s = s.replace(repeat, "1");
            }
            for(String can : canBabbling){
                s = s.replace(can, "2");
            }
            int flag = 0;
                
            for(int i=0; i<s.length(); i++){
                if(!s.subSequence(i,i+1).equals("2")){
                    flag = 1;
                    break;
                }
            }
                
            if(flag == 0){
                answer++;
            }
        }
        return answer;
    }
}