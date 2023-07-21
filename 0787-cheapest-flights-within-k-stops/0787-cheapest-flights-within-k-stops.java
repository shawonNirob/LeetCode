class Solution{
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k){
        List<List<Pair>> adj = new ArrayList();
        
        for(int i=0; i<n; i++){
            adj.add(new ArrayList());
        }
        
        int m = flights.length;
        for(int i=0; i<m; i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }
        
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;
        
        PriorityQueue<Triple> q = new PriorityQueue<>(Comparator.comparingInt(Triple -> Triple.stops));
        q.add(new Triple(0, src, 0));
        
        while(!q.isEmpty()){
            Triple pointer = q.poll();
            int stops = pointer.stops;
            int u = pointer.node;
            int dist = pointer.dist;
            
            //if(dist > distance[u]) continue;
            
            if(stops > k) continue;
            for(Pair point : adj.get(u)){
                int v = point.dest;
                int costUV = point.weight;
                
                if(dist + costUV < distance[v]){
                    distance[v] = dist + costUV;
                     q.add(new Triple(stops+1, v, distance[v]));
                }
            }
        }
        
        if(distance[dst] == Integer.MAX_VALUE) return -1;
        return distance[dst];
        
    }
}
class Pair{
    int dest;
    int weight;
    public Pair(int dest, int weight){
        this.dest = dest;
        this.weight = weight;
    }
}
class Triple{
    int stops;
    int node;
    int dist;
    public Triple(int stops, int node, int dist){
        this.stops = stops;
        this.node = node;
        this.dist = dist;
    }
}