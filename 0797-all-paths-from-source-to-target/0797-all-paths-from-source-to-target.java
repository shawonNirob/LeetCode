class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList();
        dfs(graph, 0, graph.length, ans, new ArrayList());
        return ans;
    }

    public void dfs(int[][] graph, int node, int n, List<List<Integer>> ans, List<Integer> path){
        path.add(node);

        if(node==n-1){
            ans.add(new ArrayList(path));
            return;
        }
        
        for(int i : graph[node]){
            dfs(graph, i, n, ans, path);
            path.remove(path.size()-1);
        }
    }
}