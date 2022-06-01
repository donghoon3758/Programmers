class Solution {
  public String solution(int n) {
      String[] numbers = {"4", "1", "2"};
      String answer = "";
    
      while(n > 0){
          int idx = n%3;
          n/=3;
          
          if(idx == 0) n--;
          
          answer = numbers[idx] + answer;
      }
      
      return answer;
  }
}