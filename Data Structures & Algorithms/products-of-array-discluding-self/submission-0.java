class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int left=1;
        int lefts[]=new int [n];
        for(int i=0;i<n;i++){
            left=left*nums[i];
            lefts[i]=left;

        }

        int right=1;
        int rights[]=new int[n]; 
        for (int i=n-1;0<=i;i--){
            right=right*nums[i];
            rights[i]=right;
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
           if(i==0){
             ans[i]=rights[i+1];
           } else if(i==n-1){
             ans[i]=lefts[i-1];
           }else{
             ans[i]=lefts[i-1]*rights[i+1];
           }
           
        }
        return ans;
    }
}