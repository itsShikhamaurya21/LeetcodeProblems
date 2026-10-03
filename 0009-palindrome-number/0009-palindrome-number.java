class Solution {
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false; 
        }

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int last_digit = n % 10;
            reverse = (reverse * 10) + last_digit;
            n /= 10;
        }

        return reverse == original;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome(123));   
        System.out.println(isPalindrome(121));   
        System.out.println(isPalindrome(-121));  
    }
}
