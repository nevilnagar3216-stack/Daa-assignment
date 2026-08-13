class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length -1,target);
    }

    public int bs(int arr[], int l,int h,int target){
        if(l > h){
            return -1;
        }

        int mid = (l + h)/2;

        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return bs(arr,l,mid-1,target);
        }else if(arr[mid] < target){
            return bs(arr,mid+1,h,target);
        }

        return -1;
    }
}
