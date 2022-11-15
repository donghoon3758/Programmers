import java.util.*;
class Solution {
    public int solution(String s) {
        int answer=0;
        for(int j=0; j<s.length(); j++){
            s = move(s);
            Stack<String> stk = new Stack<>();
            for(int i=0; i<s.length(); i++){
                switch(s.substring(i,i+1)){
                    case "(":
                        stk.push("(");
                        break;
                    case "{":
                        stk.push("{");
                        break;
                    case "[":
                        stk.push("[");
                        break;
                    case ")":
                        if(stk.empty()){
                            stk.push(")");
                        }else{
                            if(stk.peek().equals("(")){
                                stk.pop();
                            }
                        }
                        break;
                    case "}":
                        if(stk.empty()){
                            stk.push("}");
                        }else{
                            if(stk.peek().equals("{")){
                                stk.pop();
                            }
                        }
                        break;
                    case "]":
                        if(stk.empty()){
                            stk.push("]");
                        }else{
                            if(stk.peek().equals("[")){
                                stk.pop();
                            }
                        }
                        break;
                }
            }
            if(stk.empty()){
                answer++;
            }
        }
        
        return answer;
    }
    public String move(String s){
        String temp = "";
        temp+= s.substring(1,s.length())+s.substring(0,1);
        return temp;
    }
}