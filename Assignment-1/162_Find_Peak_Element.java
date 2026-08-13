class Solution {
    public int findPeakElement(int[] nums) {
        return bs(nums,0,nums.length-1);
    }

    public int bs(int[] nums,int l,int h){

        int mid = (l+h)/2;

        if(l == h){
            return l;
        }

        if(nums[mid] < nums[mid+1]){
            return bs(nums,mid+1,h);
        }else if(nums[mid] > nums[mid+1]){
            return bs(nums,l,mid);
        }

        return -1;
    }
}
