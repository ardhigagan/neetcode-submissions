class Solution {
    private int[] addOne(int[] digits,int n){
        if (n == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        if(digits[n-1]<9){
            digits[n-1] += 1;
            return digits;
        }
        digits[n-1] = 0;
        return addOne(digits, n-1);
    }
    public int[] plusOne(int[] digits) {
        return addOne(digits, digits.length);
    }
}
