import java.util.Scanner;

public class RockPaperScissorLoop {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   int count=0;
  int n=0;
       int coma=0;
    int pal=0;
    while (n==0) {
     System.out.println("Enter Rock(0),Paper(1),Scissor(2)");
     
    int choice =input.nextInt();

    int comp=(int)(Math.random()*Integer.MAX_VALUE%3);
    // System.out.println(comp);    
    
    if(choice==0){
      if (comp==0){
         System.out.println("The computer rock.You are rock.It is a draw.");
      }
      else if (comp==1){
          System.out.println("The computer paper.You are rock.You lose.");
          coma++;
      }
      else if (comp==2){
          System.out.println("The computer Scissor.You are rock.You win.");
          pal++;
      }
    }
    else if (choice==1){
      if (comp==0){
         System.out.println("The computer rock.You are Scissor.You win.");
          pal++;
      }
      else if (comp==1){
          System.out.println("The computer paper.You are paper.It is a draw.");
      }
      else if (comp==2){
          System.out.println("The computer scissor.You are paper.you lose.");
          coma++;
      }
    }
    else if (choice==2){

      if (comp==0){
         System.out.println("The computer rock.You are Scissor.You lose.");
         coma++;
      }
      else if (comp==1){
          System.out.println("The computer paper.You are scissor.You Win.");
           pal++;
      }
      else if (comp==2){
          System.out.println("The computer scissor.You are scissor.It is a draw.");
      }
   
    } 
     count++;
       input.nextLine();
     System.out.println("Enter y to play again:");
    
     String ans =input.nextLine();
      if (ans.equalsIgnoreCase("y")) {
       
      }
     else if(ans.equalsIgnoreCase("n")){
        n++;
      }
}
  System.out.println("In the total of "+count+" round(s), You scored "+pal+" Computer scored "+coma);
  input.close();
   } 
}
