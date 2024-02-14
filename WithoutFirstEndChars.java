import java.util.Scanner;

public class WithoutFirstEndChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string
        System.out.print("Enter a string (at least 2 characters long): ");
        String str = scanner.nextLine();
        
        // Check if the string length is at least 2
        if (str.length() >= 2) {
            // Get the substring without the first and last characters
            String result = str.substring(1, str.length() - 1);
            
            // Output the result
            System.out.println("Result: " + result);
        } else {
            // If the string length is less than 2, print an error message
            System.out.println("The string length is less than 2. Please enter a string of at least 2 characters.");
        }
      
    }
}
