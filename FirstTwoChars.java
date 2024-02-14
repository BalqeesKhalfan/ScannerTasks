/*
* Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

‌

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
* */


import java.util.Scanner;

public class FirstTwoChars {
    public static void main(String[] args) {
        Scanner ft = new Scanner(System.in);

        // Ask user to enter him inpt as a string
        System.out.print("Enter a string: ");
        String str = ft.nextLine();

        // Get the first two characters of the string
        String result = "";
        // Check  the length of string
        if (str.length() >= 2)
        {
            result = str.substring(0, 2);
        } else {
            result = str;
        }

        // Output the result
        System.out.println("Result: " + result);


    }
}
