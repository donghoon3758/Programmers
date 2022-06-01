import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split("");
        int index=0;
        for(int i=0; i<word.length; i++){
            if(word[i].equals(" ")){
                index=0;
}else if(index%2==0){
                word[i]=word[i].toUpperCase();
                index++;
}else{
                word[i]=word[i].toLowerCase();
                index++;
}
answer+=word[i];
        }
        return answer;
    }
}