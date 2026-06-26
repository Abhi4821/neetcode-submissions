class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int item:stones){
            pq.add(item);
        }
        while(pq.size()>1){
            int max=pq.remove();
            int max2=pq.remove();
            int newSt=max-max2;
            if(newSt!=0){
                pq.add(newSt);
            }
        }
        if(pq.size()==0){
            return 0;
        }else{
            return pq.remove();
        }
    }
}