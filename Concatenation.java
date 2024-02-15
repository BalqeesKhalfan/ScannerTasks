

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  first string :");
        String strOne = scanner.nextLine();

        System.out.println("Enter  Second string :");
        String strTow = scanner.nextLine();

        // Concatenate the strings, handling the case where the concatenation creates a double char
        String result = conCat(strOne, strTow);

        // Output the result
        System.out.println("Result: " + result);

    }

    public static String conCat(String a, String b) {
        // Check if the strings are empty
        if (a.isEmpty() || b.isEmpty()) {
            return a + b; // If any string is empty, return the concatenation without modification
        }

        // Check if the last character of the first string is the same as the first character of the second string
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            // If they are the same, omit one of the characters
            return a + b.substring(1);
        } else {
            // If they are different, simply concatenate the strings
            return a + b;
        }
    }
}
