class Solution {
    public int solution(int n) {
        int answer = 0;
        int original=countOne(Integer.toBinaryString(n));
        int num=n+1;
        while(true){
            int next = countOne(Integer.toBinaryString(num));
            if(original==next){
                answer=num;
                break;
            }
            num++;
       }
        return answer;
    }
    public int countOne(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("1")){
                count++;
               }
        }
    return count;
    }
}