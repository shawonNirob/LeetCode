class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        LinkedList<Integer> adj[] = new LinkedList[numCourses];
        
        for(int i=0; i<numCourses; i++){
            adj[i] = new LinkedList<>();
        }
        
        for(int[] pre : prerequisites){
            adj[pre[0]].add(pre[1]);
        }
        
        int[] visited = new int[numCourses];
        List<Integer> list = new ArrayList();
        
        for(int i=0; i<numCourses; i++){
            if(!dfs(i, visited, adj, list)){
                return new int[0];
            }
        }
        
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }
        
        return intArray;
    }
    public boolean dfs(int node, int[] visited, LinkedList<Integer> adj[],List<Integer> list){
        if(visited[node]==1) return false;
        if(visited[node]==2) return true;
        
        visited[node]=1;

        
        for(int n: adj[node]){
            if(!dfs(n,visited,adj,list)){
                return false;
            }
        }
        
        list.add(node);
        visited[node]=2;
        
        return true;
    }
}