class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces =0;
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                provinces++;
                bfs(i, isConnected, visited);
            }
        }
        return provinces;
    }
    public void bfs(int node, int[][] isConnected, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            node = q.poll();
            visited[node] = true;
            
            for(int i=0; i<isConnected.length; i++){
                if(isConnected[node][i] == 1 && !visited[i]){
                    q.add(i);
                }
            }
        }
    }
}
              
              
              
              