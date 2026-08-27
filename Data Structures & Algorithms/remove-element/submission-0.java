class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int x=0;
        int i=0;
        int k=0;
        int arr[]=new int[n];
        while(i<n){
            if (nums[i]!=val){
                x=x+1;
                arr[k]=nums[i];
                k++;
            }
            i++;
        }
        for( i=0;i<n;i++){
            nums[i]=arr[i];
        }
        return x;
    }
}