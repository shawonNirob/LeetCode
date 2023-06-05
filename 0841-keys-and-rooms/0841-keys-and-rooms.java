class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        if(rooms.size()==0) return false;
        
        int n  = rooms.size();
        if(rooms.get(0).size()==0) return false;
        
        boolean[] visited = new boolean[n];
        
        dfs(visited, 0, rooms);
        
        for(int i=0; i<n; i++){
            if(!visited[i]) return false;
        }
        
        return true;
    }
    public void dfs(boolean[] visited, int room, List<List<Integer>> rooms){
        visited[room] = true;
        
        for(int r : rooms.get(room)){
            if(!visited[r]) dfs(visited, r, rooms);
        }
    }
}