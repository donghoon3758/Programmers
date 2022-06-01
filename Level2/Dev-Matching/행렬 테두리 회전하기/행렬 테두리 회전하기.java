class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] matrix = new int[rows][columns];
        int num=1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j]=num++;
            }
        }
        for(int i=0; i<queries.length; i++){
            int[] query = queries[i];
            int r1=query[0]-1;
            int c1 = query[1]-1;
            int r2=query[2]-1; 
            int c2 = query[3]-1;
            int temp = matrix[r1][c1];
            int min = temp;
            for(int row = r1; row<r2; row++){
                min = Math.min(min, matrix[row][c1]);
                matrix[row][c1] = matrix[row+1][c1] ;
            }
            for(int column = c1; column<c2; column++){
                min = Math.min(min, matrix[r2][column]);
                matrix[r2][column]=matrix[r2][column+1];
            }
            for(int row = r2; row>r1; row--){
                min = Math.min(min, matrix[row][c2]);
                matrix[row][c2] = matrix[row-1][c2];
            }
            for(int column = c2; column>c1; column--){
                min = Math.min(min, matrix[r1][column]);
                matrix[r1][column]=matrix[r1][column-1];
            }
            matrix[r1][c1+1] = temp;
            answer[i]=min;
        }
        
        return answer;
    }
}