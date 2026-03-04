// PalindromeCharArrayCheck.java
public class PalindromeCharArrayCheck {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {
        // Hardcoded string literal
        String word = "madam";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break; // mismatch found, no need to continue
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}
