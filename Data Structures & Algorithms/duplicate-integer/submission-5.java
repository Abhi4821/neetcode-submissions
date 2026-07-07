class Solution {
    public boolean hasDuplicate(int[] nums) {
      if(nums.length==0||nums.length==1)return false;
       Arrays.sort(nums);
       int key=nums[0];
       for(int i=1;i<nums.length;i++){
         if(key==nums[i])return true;
         key=nums[i];
       } 
       return false;
    }
}