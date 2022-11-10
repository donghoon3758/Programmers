class Solution {
    public String solution(int[] food) {
        String answer = "";
        int[] cnt = new int[food.length];
        cnt[0]=0;
        for(int i=1; i<food.length; i++){
            cnt[i] = food[i]/2;
        }
        for(int i=1; i<food.length; i++){
            for(int j=cnt[i]; j>0; j--){
                answer += Integer.toString(i);
            }
        }
        answer+="0";
        for(int i=food.length-1; i>0; i--){
            for(int j=cnt[i]; j>0; j--){
                answer += Integer.toString(i);
            }
        }
        return answer;
    }
}