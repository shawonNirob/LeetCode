class Solution {
    public int findCircleNum(int[][] isConnected){
        int n = isConnected.length;
        int[] parrent = new int[n];
        int[] rank = new int[n];
        
        //initialize the parrent
        for(int i=0; i<n; i++){
            parrent[i] = i;
        }
        
        //call the union
        for(int i=0; i<n; i++){
            for(int j=0; j<isConnected[0].length; j++){
                if(isConnected[i][j] == 1){
                    unionByRank(i, j, parrent, rank);
                }
            }
        }
        
        
        int provinces = 0;
        for(int i=0; i<n; i++){
            if(parrent[i]==i) provinces++;
        }
        
        return provinces;
    }
    
    public void unionByRank(int x, int y,int[] parrent, int[] rank){
        int rootX = find(x, parrent);
        int rootY = find(y, parrent);
        
        if(rank[rootX] > rank[rootY]){
            parrent[rootY] = rootX;
        }else if(rank[rootX] < rank[rootY]){
            parrent[rootX] = rootY;
        }else{
            parrent[rootY] = rootX;
            rootX++;
        }
    }
    
    public int find(int u, int[] parrent){
        if(parrent[u] == u){
            return u;
        }else{
            return parrent[u] = find(parrent[u], parrent);
        }
    }
}
              
              
              
              