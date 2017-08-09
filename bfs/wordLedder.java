public class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> beginSet = new HashSet<String>();
        Set<String> endSet = new HashSet<String>();
        Set<String> visited = new HashSet<String>();
        int len = 1;
        int length = beginWord.length();
        beginSet.add(beginWord);
        endSet.add(endWord);
        
        while(!beginSet.isEmpty() && !endSet.isEmpty()){
            if(beginSet.size() > endSet.size()){
                Set<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }
            
            Set<String> tmp = new HashSet<String>();
            for(String word: beginSet){
                for(int i = 0; i < word.length(); i++){
                    char[] chs = word.toCharArray();
                    for(char c = 'a'; c <= 'z'; c++){
                        char t = chs[i];
                        chs[i] = c;
                        
                        String s = String.valueOf(chs);
                        if(endSet.contains(s)){
                            return len + 1;
                        }
                        
                        if(!visited.contains(s) && wordList.contains(s) ){
                            tmp.add(s);
                            visited.add(s);
                        }
                        
                        chs[i] = t;
                    }
                }
            }
            
            beginSet = tmp;
            len++;
        }
        
        return len;
    }
}