import java.util.Scanner;

public class StringWithTowChar {
    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scanner.nextLine();

        // Get the first two characters or use '@' if the string length is less than 2
        String result = "";
        if (str.length() >= 2) {
            result = str.substring(0, 2);
        } else {
            result += str.isEmpty() ? "@@" : str + "@";
        }
        System.out.println("Result : "+result);


    }
}
