class MinStack {
    Stack <Integer> st=new Stack<>();
    Stack <Integer> min=new Stack<>();
    public MinStack() {
        st=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int val) {
        if(st.size()==0||min.peek()>=val){
            min.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        int pop=st.pop();
        int m=min.peek();
        if(pop==m){
            min.pop();
        }
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
