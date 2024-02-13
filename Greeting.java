import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner greet = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = greet.nextLine();
        String greeting = helloName(name);
        System.out.println(greeting);
       // greet.close();
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}