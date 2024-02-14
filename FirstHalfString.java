/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

‌

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
* */



import java.util.Scanner;

public class FirstHalfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the length of the string is even
        if (str.length() % 2 == 0) {
            // Get the first half of the string
            String result = str.substring(0, str.length() / 2);

            // Output the result
            System.out.println("Result: " + result);
        } else {
            // If the length of the string is odd, print an error message
            System.out.println("The length of the string is odd. Please enter a string of even length.");
        }


    }
}
