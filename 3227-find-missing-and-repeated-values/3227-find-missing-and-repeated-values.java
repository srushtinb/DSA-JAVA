class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n =grid.length;
        int N=n*n;
        Set<Integer> p = new HashSet<>();
        int repeat = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!p.add(grid[i][j])) {
                    repeat= grid[i][j];
                }
            }
        }
        
       
        int miss = -1;
        for (int num = 1; num <= N; num++) {
            if (!p.contains(num)) {
                miss = num;
                break;
            }
        }
    
        
        return new int[]{repeat, miss};
    }
}
        
