class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue pq= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int idx=0;
        while(!pq.isEmpty()){
            nums[idx]=(int) pq.poll();
            idx++;
        }
        return nums;

    }
}