import java.util.Scanner;

public class ComboString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to  Input the two strings
        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();

        //  check length of strings and Determine the shorter and longer strings
        String shorter, longer;
        if (a.length() < b.length()) {
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }

        // Create the result string in the form of short+long+short
        String result = shorter + longer + shorter;

        // Output the result
        System.out.println("Result: " + result);


    }
}
