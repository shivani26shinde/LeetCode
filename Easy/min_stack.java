# Min stack problem

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> st;
    int min;
    public MinStack() {
        st = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(st.isEmpty()){
            min = x;
            st.push(x);
        }
        else if(x < min){
            st.push(x-Math.abs(min));
            min = x;
        }
        else{
            st.push(x);
        }
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        int a = st.pop();
        if(a < min){
            min = min-a;
        }
        return;
    }
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        int a = st.peek();
        if(a < min){
            return min;
        }
        return a;
    }
    
    public int getMin() {
        if(st.isEmpty()){
            return -1;
        }
        else{
            return min;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */