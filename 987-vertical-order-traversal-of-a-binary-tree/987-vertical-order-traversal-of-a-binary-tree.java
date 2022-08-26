/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public class Triplet{
        TreeNode node;
        int row;
        int col;
        public Triplet(TreeNode node, int row, int col){
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Triplet> queue = new LinkedList<Triplet>();
        queue.offer(new Triplet(root, 0, 0));
        
        while(!queue.isEmpty()){
            Triplet trio = queue.poll();
            TreeNode node = trio.node;
            int x = trio.col;
            int y = trio.row;
            
            if(!map.containsKey(x)){
                map.put(x, new TreeMap());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue());
            }
            
            map.get(x).get(y).add(node.val);
            
            if(node.left != null){
                queue.add(new Triplet(node.left, y+1, x-1));
            }
            if(node.right != null){
                queue.add(new Triplet(node.right, y+1, x+1));
            }
        }
        List<List<Integer>> list = new ArrayList();
        for(TreeMap<Integer, PriorityQueue<Integer>> map2 : map.values()){
            list.add(new ArrayList());
            for(PriorityQueue<Integer> node : map2.values()){
                while(!node.isEmpty()){
                    list.get(list.size()-1).add(node.poll());
                }
            }
        }
        return list;
    }
}