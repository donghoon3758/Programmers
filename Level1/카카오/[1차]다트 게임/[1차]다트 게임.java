import java.lang.*;
import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int index = 0;
        String temp ="";
        int[] num = new int[3];
        for(int i=0; i<dartResult.length(); i++){
            switch(dartResult.charAt(i)){
                case '*':
                    if(index > 1){
                        num[index-1]*=2;
                        num[index-2]*=2;
                    }else{
                        num[index-1]*=2;
                    }
                    break;
                case '#':
                    num[index-1]*=-1;
                    break;
                case 'S':
                    num[index] = (int)Math.pow(Integer.parseInt(temp),1);
                    index++;
                    temp="";
                    break;
                case 'D':
                    num[index] = (int)Math.pow(Integer.parseInt(temp),2);
                    index++;
                    temp="";
                    break;
                case 'T':
                    num[index] = (int)Math.pow(Integer.parseInt(temp),3);
                    index++;
                    temp="";
                    break;
                default:
                    temp += String.valueOf(dartResult.charAt(i));
                    break;
            }
            
        }
        for(int i=0; i<3; i++){
            answer+=num[i];
        }
        return answer;
    }
}