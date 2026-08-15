class Solution {
    public int search(int[] nums, int target) {
        int index=-1;
        int st=0,en=nums.length-1;
        while(st<=en){
            int mid=st +(en-st)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                st=mid+1;
            }else if(nums[mid]>target){
                en=mid-1;
            }
        }
        return -1;
    }
}