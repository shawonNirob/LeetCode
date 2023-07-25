class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> adj = new ArrayList();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList());
        }
        
        int m = edges.length;
        for(int i=0; i<m; i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][1], succProb[i]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], succProb[i]));
        }
        
        double[] distance = new double[n];
        Arrays.fill(distance, -1);
        distance[start_node] = 0;
        
        PriorityQueue<Pair> q = new PriorityQueue<>(Comparator.comparingDouble((Pair pair) -> pair.prob).reversed());
        q.add(new Pair(start_node, 1));
        
        while(!q.isEmpty()){
            Pair pointer = q.poll();
            int u = pointer.dest;
            double dist = pointer.prob;
            //if(dist < distance[u]) continue;
            
            for(Pair next : adj.get(u)){
                int v = next.dest;
                double costUV = next.prob;
                
                if(dist * costUV > distance[v]){
                    distance[v] = dist * costUV;
                    q.add(new Pair(v, distance[v]));
                }
            }
        }
        
        if(distance[end_node] == -1) return 0;
        else return distance[end_node];
    }
}
class Pair{
    int dest;
    double prob;
    public Pair(int dest, double prob){
        this.dest = dest;
        this.prob = prob;
    }
}