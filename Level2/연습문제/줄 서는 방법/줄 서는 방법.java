import java.util.ArrayList;
class Solution {
    int[][] list;
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        long fact = 1; //fact�� ó���� int ������ �ؼ� (long)�� ��Ӻ�ȯ�ؼ� ����ϴ� ��Ÿ�� ������ �߻��ؼ� longŸ������ �����ϴ� ���
        for(int i=1; i<n+1; i++){
            list.add(i);
            fact*=i;
        }
        k -= 1;
        for(int i=0; i<n; i++){
            fact /= n-i;
            long index = k/fact;//k��° �迭�� ù��° ������ index�� �� �� �ִ�.
            answer[i] = list.get((int)index);
            list.remove((int)index);
            k %= fact;// k�� °�� index�� ���ڷ� �����ؼ� �� ��° K���� ���Ѵ�.
        }
        return answer;
    }
}