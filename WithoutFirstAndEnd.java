/*
* Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

‌

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
* */

import java.util.Scanner;

public class WithoutFirstAndEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the length of the string is greater than 2
        if (str.length() > 2) {
            // Remove the first and last characters of the string
            String result = str.substring(1, str.length() - 1);

            // Output the result
            System.out.println("Result: " + result);
        } else {
            // If the length of the string is less than or equal to 2, return an empty string
            System.out.println("Result: ");
        }


    }
}
