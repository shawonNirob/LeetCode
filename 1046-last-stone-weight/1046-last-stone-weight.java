class Solution {
    
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            pq.add(stone);
        }
        while(pq.size() > 1){
            int one = pq.poll();
            int two = pq.poll();
            if(one != two){
                pq.add(one - two);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }else{
            return pq.poll();
        }
    }
}