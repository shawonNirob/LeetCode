class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph){
        //0 = unknown
        //1 = unsafe
        //2 = safe
        
        int n = graph.length;
        List<Integer> list = new ArrayList();
        int[] color = new int[n];
        
        for(int i=0; i<n; i++){
            if(dfs(i, graph, color))
                list.add(i);
        }
        
        return list;
    }
    public boolean dfs(int node, int[][] graph, int[] color){
        if(color[node] > 0)
            return color[node]==2;
        
        color[node] = 1;
        
        for(int x : graph[node]){
            if(color[x]==1)
                return false;
            if(color[x]==2)
                continue;
            if(!dfs(x, graph, color))
                return false;
        }
        color[node] = 2;
        return true;
    }
}