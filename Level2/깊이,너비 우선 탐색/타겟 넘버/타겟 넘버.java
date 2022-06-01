class Solution {
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0,numbers,target,0);
        return answer;
    }
    public void dfs(int count ,int[] numbers, int target, int sum){
        if(count==numbers.length){
            if(sum == target){
                answer++;
            }
        }else{
            dfs(count+1,numbers,target,sum+numbers[count]);
            dfs(count+1,numbers,target,sum-numbers[count]);
        }
        
        
    }
}