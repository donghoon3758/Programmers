import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

class Solution {
    static HashMap<String,Integer> map;
    public ArrayList<String> solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0; i<orders.length; i++){
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }
        for(int i=0; i<course.length; i++){
            map = new HashMap<>();
            int max = 0;
            for(int j=0; j<orders.length; j++){
                StringBuilder sb = new StringBuilder();
                if(course[i]<=orders[j].length()){
                    combi(orders[j],sb,0,0,course[i]);
                }
            }
            for(Entry<String,Integer> entry : map.entrySet()){
                max = Math.max(max,entry.getValue());
            }
            for(Entry<String,Integer> entry : map.entrySet()){
                if(max >= 2 && max == entry.getValue()){
                    answer.add(entry.getKey());
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
    public static void combi(String str, StringBuilder sb, int index, int cnt, int foodCnt){
        if(cnt == foodCnt){
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
            return;
        }
        for(int i=index; i<str.length(); i++){
            sb.append(str.charAt(i));
            combi(str,sb,i+1,cnt+1,foodCnt);
            sb.delete(cnt,cnt+1);
        }
    }
}