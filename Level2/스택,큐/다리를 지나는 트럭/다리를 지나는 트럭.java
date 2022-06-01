import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int timer=0;
        int weightSum=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<truck_weights.length; i++){
            int w = truck_weights[i];
            while(true){
                if(q.isEmpty()){
                    q.add(w);
                    weightSum+=w;
                    timer++;
                    break;
                }else if(q.size()==bridge_length){
                    weightSum-=q.poll();
                }else{
                    if(weightSum+w<=weight){
                        q.add(w);
                        weightSum+=w;
                        timer++;
                        break;
                    }else{
                        q.add(0);
                        timer++;
                    }
                }
            }
        }
        return timer+bridge_length; //timer는 1~n-1트럭까지의 시간
    }
}