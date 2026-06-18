class Solution {
    public int minSteps(String s, String t) {
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        int i = 0;
        int j = 0;
        int matches = 0;
        while (i < char1.length && j < char2.length) {
            if (char1[i] == char2[j]) {
                matches++;
                i++;
                j++;
            } else if (char1[i] < char2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return s.length() - matches;
    }
}