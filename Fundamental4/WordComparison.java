import java.util.Scanner;

public class WordComparison {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter fisrt word ");
    String First=input.nextLine();
    System.out.println("Enter second word ");
    String Second=input.nextLine();
    String Same=First.equalsIgnoreCase(Second)?"True":"False";
    System.out.println("Are both words the same? "+Same);
    input.close();
   } 
}
