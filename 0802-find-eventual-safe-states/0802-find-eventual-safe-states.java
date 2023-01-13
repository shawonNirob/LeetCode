class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //not in map = unknown
        //false(0) in map = unsafe
        //true(1) in map = safe
        
        int n = graph.length;
        List<Integer> list =  new ArrayList();
        Map<Integer, Integer> map = new HashMap();
        
        for(int i=0; i<n; i++){
            if(dfs(i, graph, map))
                list.add(i);
        }
        
        return list;
    }
    
    public boolean dfs(int node, int[][] graph, Map<Integer, Integer> map){
        if(map.containsKey(node))
            return map.get(node)==1;
        
        map.put(node, 0);
        
        for(int x : graph[node]){
            if(map.containsKey(x) && map.get(x)==1)
                continue;
            if((map.containsKey(x) && map.get(x)==0) || !dfs(x, graph, map))
                return false;
        }
        
        map.put(node, 1);
        return true;
    }
}