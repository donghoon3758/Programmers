class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] clothsCnt = new int[n];
        int cnt=0;
        
        for(int i =0; i<n; i++){
            clothsCnt[i]=1;
            for(int j=0; j<lost.length;j++){
                if(i==lost[j]-1){
                    clothsCnt[i]-=1;
                }
            }
            for(int k=0; k<reserve.length;k++){
                if(i==reserve[k]-1){
                    clothsCnt[i]+=1;
                }
            }
        }
        for(int i=1; i<n-1; i++){
            if(clothsCnt[i-1]==2 && clothsCnt[i]==0){
                clothsCnt[i-1]-=1;
                clothsCnt[i]+=1;
            }else if(clothsCnt[i]==2 && clothsCnt[i-1]==0){
                clothsCnt[i]-=1;
                clothsCnt[i-1]+=1;
            }else if(clothsCnt[i]==2 && clothsCnt[i+1]==0){
                clothsCnt[i]-=1;
                clothsCnt[i+1]+=1;
            }else if(clothsCnt[i+1]==2 && clothsCnt[i]==0){
                clothsCnt[i+1]-=1;
                clothsCnt[i]+=1;
            }
        }
        for(int i=0; i<n;i++){
            if(clothsCnt[i]==1 || clothsCnt[i]==2){
                cnt+=1;  
            }
        }
        if(n==lost.length && reserve.length==0){
            answer=0;
        }else{
            answer=cnt;
        }
        for(int i=0; i<n; i++){
            System.out.print(clothsCnt[i]);
        }
        return answer;
    }
}