class Solution {
    public int countDigits(int number) {
        int originalNumber = number; 
        int count = 0; 
        
        while (number > 0) {
            int digit = number % 10;
            
            if (originalNumber % digit == 0) {
                count++;
            }
            
            number = number / 10;
        }
        
        return count;
    }
}