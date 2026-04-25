class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m =matrix.length;
        int n = matrix[0].length;

        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         if(matrix[i][j]== target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int left =0;
        int right = m *n-1;
        while(left<= right ){
            int mid= (left + right)/2;
            int row = mid / n;
            int col = mid % n;

            int value= matrix [row][col];
            if(value== target){
            return true ;
            }
            else if(value < target ){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
         return false;
    }
}
