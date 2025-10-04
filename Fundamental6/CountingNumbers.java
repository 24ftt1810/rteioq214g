import java.util.Scanner;

public class CountingNumbers {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter an integer, the input ends if it is 0");
    int no=0;
    int po=0;
    int ne=0;
    int to=0;
    double s=0;
    while (true) {
       no=input.nextInt();
       to+=no;
       if (no!=0) {
          if (no>0){
            po++;
          }
          else {
            ne++;
          }
       }
      else{
        break;
      }
    }
    System.out.println("The number of positive no "+po);
    System.out.println("The number of negative no "+ne);
    System.out.println("The total no "+to);
    s=to/(ne+po);
    System.out.println("The number of positive no "+(s));
    input.close();
   } 
}
