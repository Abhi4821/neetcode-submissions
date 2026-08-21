class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[]ch=s.toCharArray();
        Arrays.sort(ch);
        s=new String(ch);

        char[]ch1=t.toCharArray();
        Arrays.sort(ch1);
        t=new String(ch1);

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=t.charAt(i))return false;
        }
        return true;
    }
}
