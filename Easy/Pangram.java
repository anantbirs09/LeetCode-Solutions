class Solution {
    public boolean checkIfPangram(String sentence) {
        
        
        String uniqueChars = "";
        for (String letter : sentence.split("")) {
            if (!uniqueChars.contains(letter)) {
                uniqueChars += letter;
            }
        }
        
        
        String[] letters = uniqueChars.split("");
       
        String[] alphabets = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        Arrays.sort(letters);
        Arrays.sort(alphabets); 
        
        
        if (Arrays.equals(letters, alphabets)){
            return true;
        }
        else{
            return false;
        }
    }
}