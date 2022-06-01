class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1; i<s.length()/2+1; i++){
            String str =s.substring(0,i);
            int count = 1;
            StringBuilder result = new StringBuilder();

            for(int j=i; j<s.length()+1; j+=i){
                String next = "";
                if(j+i<s.length()){
                    next = s.substring(j,j+i);
                }else{
                    next = s.substring(j,s.length());
                }
                if(str.equals(next)){
                    count++;
                }else{
                    result.append((count!=1 ? count:"") +str);
                    str=next;
                    count=1;
                }
                    
            }
            result.append(str);
            answer = Math.min(answer,result.length());
        }
        return answer;
    }
}