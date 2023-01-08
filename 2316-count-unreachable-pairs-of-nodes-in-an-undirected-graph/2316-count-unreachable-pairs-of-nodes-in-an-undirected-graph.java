class Solution {
    List<List<Integer>> adj;
    boolean[] visit;
    public long countPairs(int n, int[][] edges) {
        adj = new ArrayList();
        visit = new boolean[n];
        
        for(int i=0; i<n; i++){
            adj.add(new ArrayList());
        }
        
        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        
        long total =((long) n*(n-1))/2;
        
        for(int i=0; i<n; i++){
            if(!visit[i]){
                int count = dfs(i);
                
                long reach = ((long)count*(count-1))/2;
                
                total -= reach;
            }
        }
        
        return total;
    }
    public int dfs(int node){
        visit[node] = true;
        
        int count = 1;
        for(int x : adj.get(node)){
            if(!visit[x])
                count += dfs(x);
        }
        return count;
    }
}