/*
* Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

‌

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
* */
import java.util.Scanner;

public class MiddleTwoChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string of even length (at least 2 characters long): ");
        String str = scanner.nextLine();

        // Check if the length of the string is even and at least 2
        if (str.length() >= 2 && str.length() % 2 == 0) {
            // Get the middle two characters of the string
            String result = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);

            // Output the result
            System.out.println("Result: " + result);
        } else {
            // If the length of the string is not even or less than 2, print an error message
            System.out.println("The string length is not even or less than 2. Please enter a string of even length (at least 2 characters long).");
        }


    }
}
