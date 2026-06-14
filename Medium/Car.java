class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        return ((trips[0][0]+trips[1][0]) <= capacity);
  
    }
}