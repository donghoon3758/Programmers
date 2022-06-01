import java.util.*;
class Solution {
    int answer;
    boolean[] check = new boolean[7];
    ArrayList<Integer> list = new ArrayList<>();
    public int solution(String numbers) {
        for(int i=0; i<numbers.length(); i++){
            dfs("",numbers,i+1);
        }
        for(int i=0; i<list.size(); i++){
            if(isPrime(list.get(i))){
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(int num){
        boolean flag = false;
        if(num == 0 || num == 1){
            return flag;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return flag;
            }
        }
        return true;
        
    }
    public void dfs(String temp, String numbers,int m){
        if(temp.length()==m){
            int num = Integer.parseInt(temp);
            if(!list.contains(num)){
                list.add(num);
                return;
            }
        }else{
            for(int i=0; i<numbers.length(); i++){
                if(!check[i]){
                    check[i]=true;
                    temp+=numbers.charAt(i);
                    dfs(temp,numbers,m);
                    check[i]=false;
                    temp = temp.substring(0,temp.length()-1);
                }
            }
        }
    }
}