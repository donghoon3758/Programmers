import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String,String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(String s : record){
            String[] str = s.split(" ");
            if(str[0].equals("Enter")){
                map.put(str[1],str[2]);
                list.add(str[1]+"���� ���Խ��ϴ�.");
            }else if(str[0].equals("Change")){
                map.put(str[1],str[2]);
            }else{
                list.add(str[1]+"���� �������ϴ�.");
            }
        }
        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            int idx = list.get(i).indexOf("��");
            String str = list.get(i).substring(0,idx);
            String[] temp = list.get(i).split(" ");
            answer[i]= map.get(str)+"���� "+temp[1];
        }
        return answer;
    }
}