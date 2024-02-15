import java.util.Scanner;

public class MiddleThreeChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ask user to enter string input with odd length
        System.out.print("Enter a string of odd length (at least 3 characters long): ");
        String str = scanner.nextLine();

        // Check if the length of the string is odd and at least 3
        if (str.length() >= 3 && str.length() % 2 != 0) {
            // Get the index of the middle character
            int middleIndex = str.length() / 2;

            // Get the substring of length 3 from the middle
            String result = str.substring(middleIndex - 1, middleIndex + 2);

            // Output the result
            System.out.println("Result: " + result);
        } else {
            // If the length of the string is not odd or less than 3, print an error message
            System.out.println("The string length is not odd or less than 3. Please enter a string of odd length (at least 3 characters long).");
        }


    }
}
