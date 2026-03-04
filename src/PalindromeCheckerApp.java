// PalindromeChecker.java
public class PalindromeChecker {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {
        // Hardcoded string literal
        String word = "madam";

        // Check if the string is a palindrome
        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }

    // Helper method to check palindrome condition
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // no mismatches, it's a palindrome
    }
}
