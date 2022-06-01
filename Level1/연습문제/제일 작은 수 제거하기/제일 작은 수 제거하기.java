import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int[] sortedArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        int num = sortedArr[0];
        int j=0;
        if(arr.length>1){
            for(int i=0; i<arr.length; i++){
                if(arr[i]!=num){
                    sortedArr[j]=arr[i];
                    j++;
                }
            }
        answer = new int[arr.length-1];
        for(int i=0; i<arr.length-1; i++){
            answer[i]=sortedArr[i];
        }
        }else{
            answer[0] = -1;
        }
        return answer;
    }
}