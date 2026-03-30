class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q= new LinkedList<>();
    }

    void reverse(Queue<Integer> q){
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
    }

    
    public void push(int x) {
        q.offer(x);
        reverse(q);
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */