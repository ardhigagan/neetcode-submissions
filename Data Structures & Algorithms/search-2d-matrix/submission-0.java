class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;
        int row=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid][0]<=target){
                low = mid + 1;
                row = mid;
            } else {
                high = mid - 1;
            }
        }
        if(row==-1) return false;
        low = 0;
        high = matrix[0].length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[row][mid]==target) return true;
            else if (matrix[row][mid]<target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}