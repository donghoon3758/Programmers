import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list =  new ArrayList<>();
        ArrayList<Integer> hamburger =  new ArrayList<>();
        
        hamburger.add(1);
        hamburger.add(2);
        hamburger.add(3);
        hamburger.add(1);
        
        for(int i=0; i<ingredient.length; i++){
            list.add(ingredient[i]);
            
            if(list.size() >= 4){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(list.get(list.size()-4));
                temp.add(list.get(list.size()-3));
                temp.add(list.get(list.size()-2));
                temp.add(list.get(list.size()-1));
                
                if(temp.equals(hamburger)){
                    answer++;
                    
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                }
            }
        }
        
        return answer;
    }
}