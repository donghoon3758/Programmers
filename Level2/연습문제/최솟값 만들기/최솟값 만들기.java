import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int i=0;
        for(int j=A.length-1; j>-1; j--){
            answer+=A[i]*B[j];
            i++;
        }

        return answer;
    }
}