class Solution {
    public String solution(int n) {
        String answer = "";
        String su = "��";
        String bak = "��";
        for(int i=0; i<n; i++){
            if(i%2==0){
                answer+=su;
            }else{
                answer+=bak;
            }
        }
        return answer;
    }
}