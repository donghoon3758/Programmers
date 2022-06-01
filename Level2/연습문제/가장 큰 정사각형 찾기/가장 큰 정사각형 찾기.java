class Solution
{
    public int solution(int [][]board)
    {
        int[][] newBoard = new int[board.length+1][board[0].length+1];
        int max=0;
        for(int i=1; i<board.length+1; i++){
            for(int j=1; j<board[0].length+1; j++){
                if(board[i-1][j-1]!=0){
                    int min = Math.min(Math.min(newBoard[i-1][j],newBoard[i][j-1]),newBoard[i-1][j-1]);
                    newBoard[i][j]=min+1;
                    max=Math.max(max,min+1);
                }
            }
        }
        return max*max;
    }
}