class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int days=5; //금요일 시작 1월1일
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<a-1; i++){
            days+=months[i];
        }
        days+=b;
        answer = day[(days-1)%7];
        return answer;
    }
}