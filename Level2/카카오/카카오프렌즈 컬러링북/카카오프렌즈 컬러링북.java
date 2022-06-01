class Solution {
    static boolean check[][];
    static int count;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        count = 0;
        check = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(picture[i][j]!=0 && !check[i][j]){
                    dfs(i,j,picture);
                    numberOfArea++;
                }
                if(count>maxSizeOfOneArea){
                    maxSizeOfOneArea = count;
                }
                count=0;
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    public void dfs(int i, int j, int[][] picture){
        check[i][j]=true;
        count++;
        for(int k=0; k<4; k++){
            int x = i+dx[k];
            int y = j+dy[k];
            if(x<0 || y<0 || x>=picture.length || y>=picture[0].length){
                continue;
            }
            else if(picture[i][j]==picture[x][y] && !check[x][y]){
                dfs(x,y,picture);
            }
        }
    }
}