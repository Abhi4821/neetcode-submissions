class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        int i2=1;
        for(int i=0;i2<n;i++){
           sum+=Math.abs(s.charAt(i)-s.charAt(i2));
           i2++;
        }
        return sum;
    }
}