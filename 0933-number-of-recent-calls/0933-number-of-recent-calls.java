class RecentCounter {
    Queue<Integer> q;
    int size=0;

    public RecentCounter() {
        q= new LinkedList<>();
    }
    
    public int ping(int t) {
        q.offer(t);
        size++;
        while(q.peek()<t-3000){
            q.poll();
            size--;
        }
        return size;

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */