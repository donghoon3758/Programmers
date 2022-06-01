class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        String str = "^[0-9][^a-zA-z]*$";
        if(!s.matches(str) || s.length()<4 || s.length()>6 || s.length()==5){
            answer = false;
        }
        return answer;
    }
}