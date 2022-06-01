import java.lang.*;
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                temp[j++]=nums[i];
            }
        }
        temp[j++] = nums[nums.length-1];
        for(int i=0; i<j; i++){
            nums[i]=temp[i];
            System.out.print(temp[i]);
        }
        if(j>=(nums.length/2)){
            answer=nums.length/2;
        }else{
            answer=j;
        }
        return answer;
    }
}