import java.util.Scanner;

public class Reverse5Letters {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 letter word ");
    
    String word=input.nextLine();
   System.out.println("the reverse of "+word+" is "+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
input.close();
   } 
}
  