import java.util.Scanner;

public class AbbaStrings {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstName = str.nextLine(); // Enter first name of the user 
        System.out.print("Enter the second string: ");
        String secondName = str.nextLine();// Enter second name 
        String result = makeAbba(firstName, secondName); //calling the function of concatenate two strings (first ,second name )in a specific order,
        System.out.println("The result is: " + result);
        
    }

    public static String makeAbba(String firstName, String secondName) {
        return firstName + secondName + secondName +firstName;
    }
}
