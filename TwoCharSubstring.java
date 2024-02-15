import java.util.Scanner;

public class TwoCharSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter  a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // input the index of char
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        // Check if the index is within the valid range
        if (index >= 0 && index + 2 <= str.length()) {
            // Get the substring starting at the given index and having a length of 2
            String result = str.substring(index, index + 2);

            // Get output
            System.out.println("Result: " + result);
        } else {
            // If the index is too big or too small, use the first 2 characters
            String result;
            if (str.length() >= 2) {
                result = str.substring(0, 2);
            } else {
                result = str;
            }

            // Output the result
            System.out.println("Result: " + result);
        }


    }
}
