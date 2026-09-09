class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        int x=n-1;
        if(s.charAt(x)==' '){
           for(int i=n-1;i>=0;i--){
             if(s.charAt(x)==' '){
                x--;
             }else{
                break;
             }
           }
        }
        for(int i=x;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}