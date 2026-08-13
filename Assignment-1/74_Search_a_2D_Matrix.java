class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
		int n = matrix[0].length;
        return bs(matrix,0,m*n-1,target,n);
    }

    public  boolean bs(int arr[][], int l,int h,int target,int n){
        if(l > h){
        	
        	return false;
        }

        int mid = (l + h)/2;
        int row = mid/n;
        int column = mid % n;
        if(arr[row][column] == target){
            return true;
        }else if(arr[row][column] > target){
            return bs(arr,l,mid-1,target,n);
        }else if(arr[row][column] < target){
            return bs(arr,mid+1,h,target,n);
        }

        return false;
    }
}
