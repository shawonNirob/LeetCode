class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new LinkedList<>();
        
        while(label >= 1){
            list.add(0,label);
            
            int llv = 0, n = 1;
            while(n <= label){
                llv = n;
                n = 2*n;
            }
            int start = llv;
            int end = 2*llv - 1;
            
            int val = start + end -label;
            label = val/2;
        }
        
        return list;
    }
}