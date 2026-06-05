
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<String> abs = new ArrayList<>(Arrays.asList(operations));
        
        int i = 0;
        while (i < abs.size()) {
            String current = abs.get(i);
            
            if (current.equals("C")) {
                int a = i;                 
                abs.remove(a);             
                abs.remove(a - 1);         
                i -= 2;                    
                
            } 
            else if (current.equals("D")) {
                int b = i;                 
                int c = Integer.parseInt(abs.get(b - 1)); 
                int d = c * 2;            
                
                abs.remove(b);             
                abs.add(b, String.valueOf(d));
            
                
            } 
            else if (current.equals("+")) {
                int z = i;                 
                int x = Integer.parseInt(abs.get(z - 1)); 
                int y = Integer.parseInt(abs.get(z - 2)); 
                int f = x + y;             
                
                abs.remove(z);            
                abs.add(z, String.valueOf(f));
                
            }
            i++;
        }
        int totalSum = 0;
        for (String numStr : abs) {
            totalSum += Integer.parseInt(numStr); 
        }
        
        return totalSum;
    }
}