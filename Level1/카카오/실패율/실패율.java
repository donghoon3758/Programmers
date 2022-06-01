import java.util.*;
class Solution {
    class Rate{
        int index=0;
        double rate=0.0;
        
        public Rate(int index, double rate){
            this.index = index;
            this.rate = rate;
        }
    }
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] userCnt = new int[N+2];
        int[] arrivalCnt = new int[N+1];
        
        for(int i=0; i<stages.length; i++){
            userCnt[stages[i]]++;
        }
        arrivalCnt[N]=userCnt[N+1]+userCnt[N];
        for(int i=N-1; i>0; i--){
            arrivalCnt[i]=userCnt[i]+arrivalCnt[i+1];
        }
        ArrayList<Rate> list = new ArrayList<>();
        for(int i=1; i<N+1; i++){
            if(arrivalCnt[i]==0){
                list.add(new Rate(i,0.0));
                continue;
            }
            double rate = (double)userCnt[i]/arrivalCnt[i];
            list.add(new Rate(i,rate));
        }
        Collections.sort(list,((o1,o2)->Double.compare(o2.rate,o1.rate)));
        for(int i=0; i<N; i++){
            answer[i]=(list.get(i)).index;
        }
        return answer;
    }
}