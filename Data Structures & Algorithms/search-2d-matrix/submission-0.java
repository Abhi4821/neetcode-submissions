class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row=matrix.length;
       int col=matrix[0].length; 
       for(int i=0;i<row;i++){
          if(matrix[i][col-1]==target){
            return true;
          }
          else if(matrix[i][col-1]>target){
            for(int j=0;j<col-1;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
            return false;
          }
       }
       return false;
    }
}