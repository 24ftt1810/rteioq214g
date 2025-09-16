import java.util.Scanner;

public class RockPaperScissor {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Rock(0),Paper(1),Scissor(2)");
    int choice =input.nextInt();
    int comp=(int)Math.random()*Integer.MAX_VALUE%3;
    System.out.println(comp);
    if(choice==0){
      if (comp==0){
         System.out.println("The computer rock.You are rock.It is a draw.");
      }
      else if (comp==1){
          System.out.println("The computer paper.You are rock.You lose.");
      }
      else if (comp==2){
          System.out.println("The computer Scissor.You are rock.You win.");
      }
    }
    else if (choice==1){
      if (comp==0){
         System.out.println("The computer rock.You are Scissor.You win.");
      }
      else if (comp==1){
          System.out.println("The computer paper.You are paper.It is a draw.");
      }
      else if (comp==2){
          System.out.println("The computer scissor.You are paper.you lose.");
      }
    }
    else if (choice==2){

      if (comp==0){
         System.out.println("The computer rock.You are Scissor.You lose.");
      }
      else if (comp==1){
          System.out.println("The computer paper.You are scissor.You Win.");
      }
      else if (comp==2){
          System.out.println("The computer scissor.You are scissor.It is a draw.");
      }

    }
input.close();

   } 
}
