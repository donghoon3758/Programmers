import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : scoville){
            queue.offer(num);
        }
        while(queue.peek()<K){
            if(queue.size()==1){
                answer= -1;
                break;
            }
            int min1 = queue.poll();
            int min2 = queue.poll();
            int k = min1+(min2*2);
            queue.offer(k);
            answer++;
        }
        return answer;
    }
}