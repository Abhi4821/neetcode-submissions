class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int leftSum[]=new int[n];
        int rightSum[]=new int[n];
        if(n==1){
            return 0;
        }
        leftSum[0]=nums[0];
        rightSum[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            leftSum[i]=leftSum[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            rightSum[i]=rightSum[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(rightSum[i+1]==0){
                    return i;
                }         
            }
            else if(i==n-1){
                if(leftSum[i-1]==0){
                   return i;
                }
                
            }else{
                if(leftSum[i-1]-rightSum[i+1]==0){
                    return i;
                }
            }
        }
        return -1;
    }
}