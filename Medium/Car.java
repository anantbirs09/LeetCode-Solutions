class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        for (int i = 0; i < trips.length; i++) {
            
            int currentPassengers = 0;
            
            for (int j = 0; j < trips.length; j++) {
                
                if (trips[j][1] <= trips[i][1] && trips[j][2] > trips[i][1]) {
                    currentPassengers += trips[j][0];
                }
            }
            
            if (currentPassengers > capacity) {
                return false;
            }
        }
        
        return true;
    }
}