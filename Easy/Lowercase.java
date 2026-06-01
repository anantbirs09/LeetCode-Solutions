class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int asciiValue = (int) ch;
            if (asciiValue >= 65 && asciiValue <= 90) {
                asciiValue = asciiValue + 32;
            }
            result.append((char) asciiValue);
        }
        return result.toString();
    }
}