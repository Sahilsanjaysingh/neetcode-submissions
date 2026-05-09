class Solution {
    int [][]dir={
        {1,0},{-1,0},{0,1},{0,-1}
    };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m= heights.length;
        int  n=heights[0].length;
        boolean[][] pacific  = new boolean [m][n];
        boolean[][] atlantic = new boolean [m][n];
        for(int i =0; i<m; i++){
            dfs(heights, i, 0, pacific);
            dfs(heights, i, n-1, atlantic);
        }

        for(int j=0; j<n; j++){
            dfs(heights,0, j, pacific);
            dfs(heights, m-1, j, atlantic);
        }

    List<List<Integer>> ans= new ArrayList<>();
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
        }
    }
    }
    return ans;
}

 public void dfs(int[][] heights,
                    int row,
                    int col,
                    boolean[][] visited) {

        visited[row][col] = true;

        for(int[] d : dir) {

            int nr = row + d[0];
            int nc = col + d[1];

            if(nr < 0 || nc < 0 ||
               nr >= heights.length ||
               nc >= heights[0].length ||
               visited[nr][nc] ||
               heights[nr][nc] < heights[row][col]) {

                continue;
            }

            dfs(heights, nr, nc, visited);
        }
    }
}
