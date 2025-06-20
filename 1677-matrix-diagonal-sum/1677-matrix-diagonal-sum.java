class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i+j==n-1 || i-j==0)
                {
                     s+=mat[i][j];
                }
            }
        }
        return s;
    }
}