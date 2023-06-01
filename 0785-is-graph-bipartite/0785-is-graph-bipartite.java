class Solution {
    public boolean isBipartite(int[][] graph) {
        int m = graph.length;
        
        int[] color = new int[m];
        Arrays.fill(color, -1);
        
        for(int i=0; i<m; i++){
            if(color[i] == -1 && dfs(i, color, 0, graph)){
                return false;
            }
        }
        
        return true;
    }
    public boolean dfs(int node, int[] color, int kind, int[][] graph){
        color[node] = kind;
        
        for(int u: graph[node]){
            if(color[u] == -1){
                if(dfs(u, color,1-kind, graph)){
                    return true;
                }
            }else if(color[u] == kind){
                return true;
            }
        }
        return false;
    }
}