class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Boolean>h=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(! h.containsKey(nums[i])){
              h.put(nums[i],false);
           }
        }
        for (int key :h.keySet()) {
            if(h.containsKey(key-1)==false){
                h.put(key,true);
            }
        }
        int max=0;
        for(int key :h.keySet()){
            int k=1;
            if(h.get(key)==true){
                while (h.containsKey(key+k)){
                    k++;
                }
                max=Math.max(max,k);
            }
        }
        
        return max;
    }
}