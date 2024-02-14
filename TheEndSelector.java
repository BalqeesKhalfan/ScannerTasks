import java.util.Scanner;

public class TheEndSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string (non-empty): ");
        String str = scanner.nextLine();

        // Input a boolean indicating whether to take the character from the front or back
        System.out.print("Front (true) or back (false)? Enter true or false: ");
        boolean front = scanner.nextBoolean();

        // Check if the front parameter is true or false
        String result;
        if (front) {
            // If front is true, take the character from the front
            result = str.substring(0, 1);
        } else {
            // If front is false, take the character from the back
            result = str.substring(str.length() - 1);
        }

        // Output the result
        System.out.println("Result: " + result);


    }
}
