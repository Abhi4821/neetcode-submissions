class Solution {
    public int findMin(int[] nums) {
        int st=0;
        int n=nums.length;
        int en=n-1;
       if(n==1){
        return nums[0];
       }else if(nums[0]<nums[n-1]){
        return nums[0];
       }
        while(st<=en){
            int mid=(en+st)/2;
            if(mid!=0&&nums[mid-1]>nums[mid]){
                return nums[mid];
            }else if(mid!=n-1&&nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }else if (nums[st]<nums[mid]){
                st=mid+1;
            }else{
                en=mid-1;
            }
        }
        return -1;
    }
}