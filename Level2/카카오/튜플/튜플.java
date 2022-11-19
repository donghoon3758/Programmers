import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String s) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        s = s.substring(2,s.length());
        s = s.substring(0,s.length()-2).replace("},{", "-");
        
        String[] element = s.split("-");
        
        Arrays.sort(element,new Comparator<String>(){
            public int compare(String o1, String o2){
                
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        for(String str : element){
            String[] temp = str.split(",");
            for(String tempStr : temp){
                if(!answer.contains(Integer.parseInt(tempStr))){
                    answer.add(Integer.parseInt(tempStr));
                } 
            } 
        }
        return answer;
    }
}