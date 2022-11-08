class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a && n >= 2){
            answer = answer + b*(n/a);
            n = b*(n/a) + n%a;
            System.out.println(n);
        }
        return answer;
    }
}