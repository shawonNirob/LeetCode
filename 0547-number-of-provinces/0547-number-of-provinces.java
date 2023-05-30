class Solution {
    public int findCircleNum(int[][] isConnected){
        int n = isConnected.length;
        int[] parrent = new int[n];
        int[] size = new int[n];
        
        //initialize the parrent
        for(int i=0; i<n; i++){
            parrent[i] = i;
            size[i] = 1;
        }
        
        //call the union
        for(int i=0; i<n; i++){
            for(int j=0; j<isConnected[0].length; j++){
                if(isConnected[i][j] == 1){
                    unionBySize(i, j, parrent, size);
                }
            }
        }
        
        //find the ultimate parrent
        int provinces = 0;
        for(int i=0; i<n; i++){
            if(parrent[i]==i) provinces++;
        }
        
        return provinces;
    }
    
    public void unionBySize(int x, int y,int[] parrent, int[] size){
        int rootX = find(x, parrent);
        int rootY = find(y, parrent);
        
        if(size[rootX] > size[rootY]){
            parrent[rootY] = rootX;
            size[rootX] += size[rootY];
            
        }else if(size[rootX] < size[rootY]){
            parrent[rootX] = rootY;
            size[rootX] += size[rootY];
            
        }else{
            parrent[rootY] = rootX;
             size[rootX] += size[rootY];
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
              
              
              
              