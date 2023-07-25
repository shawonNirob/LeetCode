class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList();
        for(int i=0; i<n+1; i++){
            adj.add(new ArrayList());
        }
        
        int m = times.length;
        for(int i=0; i<m; i++){
            adj.get(times[i][0]).add(new Pair(times[i][1], times[i][2]));
        }
        
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;
        
        PriorityQueue<Pair> q = new PriorityQueue<>(Comparator.comparingInt(Pair -> Pair.time));
        q.add(new Pair(k,0));
        
        while(!q.isEmpty()){
            Pair pointer = q.poll();
            int u = pointer.dest;
            int dist = pointer.time;
            
            if(dist > distance[u]) continue;
            
            for(Pair next : adj.get(u)){
                int v = next.dest;
                int costUV = next.time;
                
                if(dist + costUV < distance[v]){
                    distance[v] = dist + costUV;
                    q.add(new Pair(v, distance[v]));
                }
            }
        }
        
        int max = distance[1];
        for(int i=2; i<distance.length; i++){
            max = Math.max(distance[i], max);
        }
        
        if(max == Integer.MAX_VALUE) return -1;
        else return max;
    }
}
class Pair{
    int dest;
    int time;
    public Pair(int dest, int time){
        this.dest = dest;
        this.time = time;
    }
}