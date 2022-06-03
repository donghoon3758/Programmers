class Solution {
    public int solution(int n) {
        int answer = 0;
        long[] arr = new long[n+1];
        arr[0]=1;
        arr[2]=3; //n==2일때 3가지 n==홀수 인 경우 0 n-4마다 새로운 퍼즐이 생긴다 n-4경우에서 *2
        for(int i=4; i<n+1; i+=2){
            arr[i] = arr[i-2]*3;
            for(int j=i-4; j>=0; j-=2){
                arr[i] += arr[j]*2;
            }
            arr[i]%=1000000007;
        }
        return (int)arr[n];
    }
}