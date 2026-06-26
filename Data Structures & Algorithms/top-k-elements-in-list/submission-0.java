class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer ,Integer>hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> minHeap =new PriorityQueue<>((a, b) -> hm.get(a) - hm.get(b) );
        for (int elem : hm.keySet()) {
            minHeap.offer(elem);          
            if (minHeap.size() > k) {
               minHeap.poll();          
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
           result[i] = minHeap.poll();   // polls lowest first → fills from end
        }
        return result;
    }
}