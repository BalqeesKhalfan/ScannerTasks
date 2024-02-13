/*The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, 
the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML 
string with tags around the word,
e.g. "<i>Yay</i>".
makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"*/


import java.util.Scanner;

public class HTMLTagMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the tag and word strings
        System.out.print("Enter the tag: ");
        String tag = scanner.nextLine();
        
        System.out.print("Enter the word: ");
        String word = scanner.nextLine();
        
        // Create the HTML string with tags around the word
        String htmlString = makeTags(tag, word);
        
        // Output the HTML string
        System.out.println("HTML string: " + htmlString);
        
        scanner.close();
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
