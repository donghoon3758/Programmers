class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] cnt = new int[10];
        
        for(int s : score){
            cnt[s]++;
        }
        
        for(int i=9; i>0; i--){
            if(cnt[i]/m >= 1){
                answer += m*i*(cnt[i]/m);
            }
            cnt[i-1] += cnt[i]%m;
        }
        for(int s : cnt){
            System.out.println(s);
        }
        
        return answer;
    }
}