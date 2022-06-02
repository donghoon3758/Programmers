import java.util.*;
import java.lang.*;
class Solution {
    int answer;
    public int solution(int n) {
        answer=0;
        int[] x= new int[n];
        int[] y = new int[n];
        
        for(int i=0; i<n; i++){
            x[0]=0;
            y[0]=i;
            NQueen(x,y,1,n);
        }
        return answer;
    }
    public void NQueen(int[] x,int[] y, int count, int n){
        if(count==n){
            answer++;
            return ;
        }
        for(int i=0; i<n; i++){
            int newX = count;
            int newY = i;
            boolean check = true;
            for(int j=0; j<count; j++){
                int beforeX = x[j];
                int beforeY = y[j];
                if(newY==beforeY || Math.abs(newX-beforeX) == Math.abs(newY-beforeY)){
                    check = false;
                    break;
                }
            }
            if(check){
                x[count]=newX;
                y[count]=newY;
                NQueen(x,y,count+1,n);
            }
        }
    }
}