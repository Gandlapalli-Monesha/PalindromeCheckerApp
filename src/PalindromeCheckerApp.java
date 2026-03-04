// PalindromeQueueStackDemo.java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeQueueStackDemo {

    // Main Method – Entry point of the Java application
    public static void main(String[] args) {
        // Hardcoded string literal
        String word = "madam";

        // Create a Queue (FIFO) and a Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push each character
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
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
