class Solution{
    HashSet<Integer> seenNumbers = new HashSet<>();

    public boolean isHappy(int n) {

        if (n == 1) return true;
    
        if (seenNumbers.contains(n)) return false; 

        seenNumbers.add(n);

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return isHappy(sum);
    }
}