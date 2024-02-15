import java.util.Scanner;

public class BadCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check if "bad" appears starting at index 0 or 1
        boolean result = hasBad(str);

        // Output the result
        System.out.println("Result: " + result);


    }

    public static boolean hasBad(String str) {
        // Check if "bad" appears starting at index 0 or 1
        return str.startsWith("bad") || (str.length() > 1 && str.substring(1).startsWith("bad"));
    }
}
