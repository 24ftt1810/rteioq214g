import java.util.Scanner;

public class ReplaceSubString {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your message");
    String word=input.nextLine();
    System.out.println("Enter the substring to replace: ");
    String sub=input.nextLine();
    System.out.println("Enter the replace word");
    String re=input.nextLine();
  System.out.println("The Updated msg is\n"+word.replace(sub, re));


input.close();


   } 
}
