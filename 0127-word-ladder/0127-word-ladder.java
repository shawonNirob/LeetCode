class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(beginWord, 1));
        set.remove(beginWord);
        
        while(!queue.isEmpty()){
            Pair seq = queue.poll();
            int level = seq.level;
            String word = seq.word;
            
            if(word.equals(endWord) == true) return level;
            
            for(int i=0; i<beginWord.length(); i++){
                for(char ch='a'; ch<='z'; ch++){
                    char[] arr = word.toCharArray();
                    arr[i] = ch;
                    String str = new String(arr);
                    
                    if(set.contains(str)){
                        set.remove(str);
                        queue.add(new Pair(str, level+1));
                    }
                }
            }
        }
        
        return 0;
    }
}
class Pair{
    String word;
    int level;
    public Pair(String word, int level){
        this.word = word;
        this.level = level;
    }
}