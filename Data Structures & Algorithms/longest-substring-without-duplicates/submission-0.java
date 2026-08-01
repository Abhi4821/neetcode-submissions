class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=l;
        int maxLen=1;
        Map<Character,Integer>map=new HashMap<>();
        if(s.length()==0){
            return 0;
        }
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                   l=1+map.get(s.charAt(r));
                }
                map.replace(s.charAt(r),r);
            }else{
                map.put(s.charAt(r),r);
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}