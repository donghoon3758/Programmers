class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] arr = new int[right-left+1];
        int k=0;
        int sum=0;
        for(int i=left; i<right+1; i++){
            int count = 0;
            for(int j=1; j<i+1; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count%2==0){
                arr[k++]=i;
            }else{
                arr[k++]=-i;
            }
        }
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        answer=sum;
        return answer;
    }
}