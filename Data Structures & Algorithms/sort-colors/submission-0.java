class Solution {
    public void sortColors(int[] nums) {
        int lo=0;
        int n=nums.length;
        int mid=0;
        int hi=n-1;
        while(mid<=hi){
            if(nums[mid]==0){
                int temp=nums[lo];
                nums[lo]=nums[mid];
                nums[mid]=temp;
                lo++;mid++;
                
            }else if(nums[mid]==1){
                mid=mid+1;
            }else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[hi];
                nums[hi]=temp;
                hi--;
            }else{
               
            }
        }
        return;
    }
}