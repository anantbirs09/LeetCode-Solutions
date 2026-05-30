class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0; 
        
        for (int i = 0; i < sentences.length; i++) {
    
            int currentWordCount = sentences[i].split(" ").length;
   
            if (currentWordCount > maxWords) {
                maxWords = currentWordCount;
            }
        }
        
        return maxWords;
    }
}