/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node ==null) return null;
        Node ans = new Node(node.val);
        HashMap<Node,Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        map.put(node,ans);
        while(!q.isEmpty()){
            Node n = q.poll();
            Node a = map.get(n);
            List<Node> ls = new ArrayList<>();
            for(Node i:n.neighbors){
                if(!map.containsKey(i)){
                    Node copy = new Node(i.val);
                    map.put(i,copy);
                    q.offer(i);
                    
                }
                ls.add(map.get(i));
            }
            a.neighbors = ls;
        }
        return ans;
    }
}