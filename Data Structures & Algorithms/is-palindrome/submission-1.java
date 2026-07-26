class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i)); 
            }
        }
        n=sb.length();
        int st=0;
        int en=n-1;
        while(st<=en){
            if(sb.charAt(st)!=sb.charAt(en)){
                return false;
            }else{
                st++;
                en--;
            }
        }
        return true;
    }
}