class Solution{
    public int longestCycle(int[] edges){
        int max = -1;
        int n = edges.length;
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                Map<Integer, Integer> map = new HashMap();
                int node = i;
                int edge = 0;
                while(node != -1){
                    if(map.containsKey(node)){
                        max = Math.max(max, edge - map.get(node));
                        break;
                    }
                    if(visited[node]) break;
                    map.put(node, edge++);
                    visited[node] = true;
                    node = edges[node];
                }
            }
        }
        
        return max;
    }
}