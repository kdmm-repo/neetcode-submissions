class MinStack {
    Stack<Integer> st ;

    public MinStack() {
        this.st = new Stack<Integer>();
    }
    
    public void push(int val) {
        this.st.push(val);
    }
    
    public void pop() {
        this.st.pop();
    }
    
    public int top() {
       return this.st.peek();
    }
    
    public int getMin() {
     int min= this.st.peek() ;
     for(int e : this.st){
        min = Math.min(min,e);
     }
     return min;
    }
}
