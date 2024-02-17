import java.util.Scanner;

public class LastTwoCharsSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Swap the last two characters, if present
        String result = lastTwo(str);

        // Output the result
        System.out.println("Result: " + result);


    }

    public static String lastTwo(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Extract the last two characters
            String lastTwoChars = str.substring(str.length() - 2);

            // Swap the last two characters
            return str.substring(0, str.length() - 2) + lastTwoChars.charAt(1) + lastTwoChars.charAt(0);
        } else {
            // If the length of the string is less than 2, return the string as it is
            return str;
        }
    }
}
