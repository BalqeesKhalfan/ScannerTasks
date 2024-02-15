import java.util.Scanner;

public class EndsLyChecker {

    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // ask user to enter string
        System.out.println("Enter a String :");
        String str=scanner.nextLine();
        //check if the string user enter ends with ly
       boolean result =str.endsWith("ly");
       System.out.println(result);



    }
}
