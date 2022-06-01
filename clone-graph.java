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
        if(node == null) {
            return node;
        }
        Map<Node,Node> visited = new HashMap<Node,Node>();
        Node copyNode = new Node(node.val);
        dfs(copyNode, node, visited);
        return copyNode;
    }
    
    public void dfs(Node copyNode, Node node,  Map<Node,Node> visited){
        
        visited.put(node, copyNode);
        for(Node neighbor : node.neighbors){
            if(!visited.containsKey(neighbor)){
                Node newNode = new Node(neighbor.val);
                copyNode.neighbors.add(newNode);
                dfs(newNode, neighbor ,visited);
            }else{
                copyNode.neighbors.add(visited.get(neighbor));
            }
        }
        
    }
}
