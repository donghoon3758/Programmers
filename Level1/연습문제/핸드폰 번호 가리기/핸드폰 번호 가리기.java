class Solution {
    public String solution(String phone_number) {
        String answer = "";
        if(phone_number.length()>4){
            String str = phone_number.substring(phone_number.length()-4,phone_number.length());
            for(int i=0; i<phone_number.length()-4; i++){
                answer+="*";
            }
            answer+=str;
        }else{
            answer = phone_number;
        }
        return answer;
    }
}