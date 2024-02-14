/*
* Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
* */
import java.util.Scanner;

public class NonStartConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two strings
        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        // Omit the first character of each string and concatenate them
        String result = a.substring(1) + b.substring(1);

        // Output the result
        System.out.println("Result: " + result);


    }
}
