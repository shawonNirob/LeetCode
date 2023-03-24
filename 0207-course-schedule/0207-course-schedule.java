class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        LinkedList<Integer> adj[] = new LinkedList[numCourses];
        
        for(int i=0; i<numCourses; i++){
            adj[i] = new LinkedList<>();
        }
        
        for(int[] pre : prerequisites){
            adj[pre[0]].add(pre[1]);
        }
        
        int[] visited = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            if(!dfs(i, visited, adj)){
               return false;
            }
        }
        return true;
    }
    public boolean dfs(int node, int[] visited, LinkedList<Integer> adj[]){
        if(visited[node]==1) return false;
        if(visited[node]==2) return true;
        
        visited[node]=1;
        
        for(int i : adj[node]){
            if(!dfs(i, visited, adj)){
               return false;
            }
        }
        visited[node]=2;
        
        return true;
    }
}