// PalindromeDequeCheck.java
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeDequeCheck {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {
        // Hardcoded string literal
        String word = "madam";

        // Create a Deque (Double Ended Queue)
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char ch : word.toCharArray()) {
            deque.add(ch);
        }

        // Compare front and rear until empty or mismatch
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst(); // remove from front
            char rear = deque.removeLast();   // remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}
