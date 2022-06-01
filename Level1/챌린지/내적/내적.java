class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int[] num = new int[a.length];
        for(int i =0; i<a.length;i++){
            num[i]=a[i]*b[i];
        }
        for(int i=0; i<num.length;i++){
            answer+=num[i];
        }
        return answer;
    }
}