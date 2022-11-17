import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();
        
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        
        str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      
      for(int i = 0 ; i < str1.length() - 1 ; ++i){
          char first = str1.charAt(i);
          char second = str1.charAt(i + 1);
          
          if(first >= 'a' && first <= 'z' &&
             second >= 'a' && second <= 'z'){
              arr1.add(first + "" + second);
          }
      }
      
      for(int i = 0 ; i < str2.length() - 1 ; ++i){
          char first = str2.charAt(i);
          char second = str2.charAt(i + 1);
          
          if(first >= 'a' && first <= 'z' &&
             second >= 'a' && second <= 'z'){
              arr2.add(first + "" + second);
          }
      }
        
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        for(String s : arr1){
            if(arr2.remove(s)){
                intersection.add(s);
            }
            union.add(s);
        }
        for(String s : arr2){
          union.add(s);
        }
      
        double jakard = 0;
      
        if(union.size() == 0){
            jakard = 1;
        }else{
            jakard = (double)intersection.size() / (double)union.size();
        }
            
        return (int)(jakard * 65536);
    }
}