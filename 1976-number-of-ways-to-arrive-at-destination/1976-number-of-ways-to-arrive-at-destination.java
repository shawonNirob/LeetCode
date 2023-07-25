class Solution {
    public int countPaths(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList());
        }
        
        int m = roads.length;
        for(int i=0; i<m; i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][1], roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0], roads[i][2]));
        }
        
        long[] ways = new long[n];
        ways[0] = 1;
        
        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[0] = 0;
        
        PriorityQueue<Pair> q = new PriorityQueue<>(Comparator.comparingLong(Pair -> Pair.time));
        q.add(new Pair(0,0));
        
        int mod = (int) (1e9+7);
        
        while(!q.isEmpty()){
            Pair pointer = q.poll();
            int u = pointer.dest;
            long dist = pointer.time;
            
            if(dist > distance[u]) continue;
            
            for(Pair next : adj.get(u)){
                int v = next.dest;
                long costUV = next.time;
                
                if(dist + costUV < distance[v]){
                    distance[v] = dist + costUV;
                    ways[v] = ways[u];
                    q.add(new Pair(v, distance[v]));
                }
                else if(dist + costUV == distance[v]){
                    ways[v] = (ways[v]+ ways[u]) % mod;
                }
            }
        }
        
        return (int)(ways[n-1] % mod);
        
    }
}
class Pair{
    int dest;
    long time;
    public Pair(int dest, long time){
        this.dest = dest;
        this.time = time;
    }
}