class Solution {
    static int answer;
    boolean[] check;
    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        answer = 0;
        dfs(0,k,dungeons);
        return answer;
    }
    public void dfs(int count, int k, int[][] dungeons){
        for(int i=0; i<dungeons.length; i++){
           if(!check[i] && k>=dungeons[i][0]){
               check[i]=true;
               dfs(count+1, k-dungeons[i][1],dungeons);
               check[i]=false;
           }
            answer=Math.max(answer,count);
        }
    }
}