class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        else if(num<10){
        return num;}
        else{
        return addDigits((num/10)+(num%10));}
    }
}