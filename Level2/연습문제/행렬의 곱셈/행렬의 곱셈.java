class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1.length;
        int n = arr1[0].length;
        int k = arr2[0].length;
        int[][] answer = new int[m][k];
        for(int i=0; i<m; i++){
            for(int j=0; j<k; j++){
                for(int r=0; r<n; r++){
                    answer[i][j]+=arr1[i][r]*arr2[r][j];
                }
            }
        }
        return answer;
    }
}