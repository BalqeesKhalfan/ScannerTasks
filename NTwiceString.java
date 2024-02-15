import java.util.Scanner;
public class NTwiceString {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);


        //Ask user to enter String
        System.out.println("Enter a String :");
        String str =scanner.nextLine();

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();



        // Check if the length of the string is at least n
        if (str.length() >= n) {
            // Get the substring made of the first n characters
            String firstN = str.substring(0, n);

            // Get the substring made of the last n characters
            String lastN = str.substring(str.length() - n);

            // Concatenate the first and last n characters
            String result = firstN + lastN;

            // Output the result
            System.out.println("Result: " + result);
        } else {
            // If the length of the string is less than n, print an error message
            System.out.println("The string length is less than n. Please enter a string of at least length " + n + ".");
        }


    }
}
