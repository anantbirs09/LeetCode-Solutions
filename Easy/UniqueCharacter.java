class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentLetter = s.charAt(i);
            if (s.indexOf(currentLetter) == s.lastIndexOf(currentLetter)) {
                return i; 
            }
        }
        return -1;
    }
}