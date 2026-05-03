class Solution {
    public void setZeroes(int[][] matrix) {
        int m= matrix.length, n= matrix[0].length;
        boolean rowZero=false, colZero=false;
        //Step1 check frist row
        for(int j=0; j<n; j++){
            if(matrix[0][j]==0)rowZero=true;
        }
        //check frist col
        for(int i=0; i<m; i++){
            if(matrix[i][0]==0)colZero=true;
        }
        //mark zero
        for(int i=1;i<m; i++){
            for(int j=1; j<n; j++){
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i=1;i<m;i++) {
            for (int j=1; j<n; j++) {
                if (matrix[i][0]== 0 || matrix[0][j]== 0) {
                    matrix[i][j]=0;
                }
            }
        }
        // Step 5: first row
        if (rowZero) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }

        // Step 6: first column
        if (colZero) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }

    }
}
