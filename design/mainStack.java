public class MinStack {
    
    Stack<Integer> main;
    Stack<Integer> helper;
    
    /** initialize your data structure here. */
    public MinStack() {
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        main.push(x);
        if (helper.isEmpty() || helper.peek() >= x) helper.push(x);
    }
    
    public void pop() {
        int ele = main.pop();
        if(ele == helper.peek()){helper.pop();}
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return helper.peek();
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