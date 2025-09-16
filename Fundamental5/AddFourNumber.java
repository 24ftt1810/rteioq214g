import java.util.Scanner;

public class AddFourNumber {
   public static void main(String[] args) {
    int a=(int)(Math.random()*100);
     int b=(int)(Math.random()*100);
     int c=(int)(Math.random()*100);
     int d=(int)(Math.random()*100);
     int sum =a+b+c+d;
     System.out.println("what is "+a+"+"+b+"+"+c+"+"+d+"?");
     Scanner input = new Scanner(System.in);
     int ans=input.nextInt();
     if(ans==sum){
        System.out.println("Well done, you are correct!");
     }
     else{
        System.out.println("Nice Try,the shud be "+sum);
     }
     input.close();



   } 
}
