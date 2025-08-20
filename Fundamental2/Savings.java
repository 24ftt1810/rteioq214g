import java.util.Scanner;

public class Savings {
     public static void main(String[] args){

Scanner r=new Scanner(System.in);

System.out.println("What is your target amount? ");
double saving=r.nextDouble();
System.out.println("How many month(s) to reach your goal?  ");
int months=r.nextInt();
double amount= (saving/(months*30));


System.out.printf("The amount you need to save per day is  %.2f%n",amount);










r.close();


}
}