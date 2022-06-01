class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int yCnt=0;
        int pCnt=0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='y'){
                yCnt++;
            }else if(s.charAt(i)=='p'){
                pCnt++;
            }
        }
        System.out.println(yCnt);
        System.out.println(pCnt);
        if(yCnt==pCnt){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}