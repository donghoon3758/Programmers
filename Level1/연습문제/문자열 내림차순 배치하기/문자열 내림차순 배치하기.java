import java.util.*;
import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            list.add(String.valueOf(s.charAt(i)));
        }
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
        }
        return answer;
    }
}