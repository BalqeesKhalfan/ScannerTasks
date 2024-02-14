/*
* Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.



left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"
*
* */


import java.util.Scanner;

public class LeftTowRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string (at least 2 characters long): ");
        String str = scanner.nextLine();

        // Check if the string length is at least 2
        if (str.length() >= 2) {
            // Rotate the first 2 characters to the end
            String result = str.substring(2) + str.substring(0, 2);

            // Output the result
            System.out.println("Result: " + result);
        } else {
            // If the string length is less than 2, print an error message
            System.out.println("The string length is less than 2. Please enter a string of at least 2 characters.");
        }


    }
}
