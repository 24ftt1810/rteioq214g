import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int maxnum=100;
       int rand = (int)(Math.random()*(maxnum+1));
        int rand1 = (int)(Math.random()*(maxnum+1));
        System.out.println(rand+"+"+rand1);
  
        int ans=input.nextInt();
       String truth=ans==rand+rand1==true?"true":"false";

    System.out.println(rand+"+"+rand1+" = "+truth);

       System.out.println(rand+"%"+rand1);
       int ans2=input.nextInt();

       String truth2=ans2==rand%rand1==true?"true":"false";



     System.out.println(rand+"%"+rand1+" = "+truth2);
     input.close();
    }
}
