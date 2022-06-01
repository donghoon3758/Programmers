import java.lang.*;
import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length;i++){
            if(i + 2 >= nums.length) break;
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum= nums[i]+nums[j]+nums[k];
                    answer+=1;
                    for(int m=2; m<sum;m++){
                        if(sum%m==0){
                            answer-=1;
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}