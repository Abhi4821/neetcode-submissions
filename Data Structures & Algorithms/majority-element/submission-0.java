class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(!hp.containsKey(nums[i])){
             hp.put(nums[i],1);
           }else {
             hp.put(nums[i],hp.get(nums[i])+1);
           } 
        }
        int max=0;
        for(Integer key:hp.keySet()){
           if(hp.get(key)>n/2){
             max=key;
           }
        }
        return max;
    }
}