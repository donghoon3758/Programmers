import java.util.ArrayList;
class Solution {
    int[][] list;
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        long fact = 1; //fact를 처음에 int 형으로 해서 (long)로 계속변환해서 사용하니 런타임 에러가 발생해서 long타입으로 선언하니 통과
        for(int i=1; i<n+1; i++){
            list.add(i);
            fact*=i;
        }
        k -= 1;
        for(int i=0; i<n; i++){
            fact /= n-i;
            long index = k/fact;//k번째 배열의 첫번째 숫자의 index를 알 수 있다.
            answer[i] = list.get((int)index);
            list.remove((int)index);
            k %= fact;// k번 째가 index의 숫자로 시작해서 몇 번째 K인지 구한다.
        }
        return answer;
    }
}