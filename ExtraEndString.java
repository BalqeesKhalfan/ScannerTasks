/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.



extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
*/


import java.util.Scanner;

public class ExtraEndString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string (at least 2 characters long): ");
        String str = scanner.nextLine();

        // Create a new string with 3 copies of the last 2 characters
        String result = str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);

        // Output the result
        System.out.println("Result: " + result);


    }
}
