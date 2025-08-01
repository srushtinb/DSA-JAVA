class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){
                int area=callDFS(grid,i,j);
                max=Math.max(max,area);
            }
        }
    }
        return max;
    }

    public static int callDFS(int[][] grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[i].length||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        return 1+callDFS(grid,i+1,j)+callDFS(grid,i-1,j)+callDFS(grid,i,j+1)+callDFS(grid,i,j-1);
    }
}