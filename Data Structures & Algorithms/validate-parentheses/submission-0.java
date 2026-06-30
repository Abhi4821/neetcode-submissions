
class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack <Character>st=new Stack <>();
        for (int i=0;i<n;i++){
            char chs=s.charAt(i);
            if(st.size()==0&&(chs==')'||chs=='}'||chs==']')){
                return false;
            }
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                char ch=s.charAt(i);
                st.push(ch);
            }else if(st.peek().equals('(')&& s.charAt(i)!=')'){
                return false;
            }else if(st.peek().equals('{')&&  s.charAt(i)!='}'){
                return false ;
            }
            else if(st.peek().equals('[')&& s.charAt(i)!=']'){
                return false ;
            }else{
                st.pop();
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
    }
}