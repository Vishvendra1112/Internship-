class Solution {
    
    public boolean check(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        Queue<int[]> q = new LinkedList<>();
        visited[src] = true;
        q.add(new int[]{src, -1});
        
        while(!q.isEmpty()) {
            int[] pair = q.poll();
            int node = pair[0];
            int parent = pair[1];
        
        for(int adjacentNode : adj.get(node)) {
            if(!visited[adjacentNode]) {
                visited[adjacentNode] = true;
                q.add(new int[]{adjacentNode, node});
            } else if (adjacentNode != parent) {
                return true;
                }
            }
        }
        return false;
    }