import java.util.Scanner;


public class fundamental2 {
    public static void main(String[] args){

double a=4.0;
double b=6.0;
double pi=3.14;
double c=8.0;


System.out.println("The area of square "+(a*a)+" \n"+"The area of triangle "+(a*b/2)+"\n" + "The area of circle "+(pi*c*c)  );
Scanner r=new Scanner(System.in);




System.out.println("Enter number of byte");
int i=r.nextInt();
System.out.println(i+" byte(s) is "+(i*8)+" bits");

System.out.println("Enter Character");
Character h=r.next().charAt(0);
int w=(int) h;
System.out.println("The Unicode for charcter "+h+" is "+w);


System.out.println("Each durian cost $15.75");
System.out.println("How much money do you have? ");
double money=r.nextDouble();
double nodurian=15.75/money;
System.out.println("The number of durian(s) you can buy is "+nodurian);



System.out.println("What is your target amount? ");
double saving=r.nextDouble();
System.out.println("How many month(s) to reach your goal?  ");
double months=r.nextDouble();
double amount=saving/months;
System.out.println("The amount you need to save per day is $ "+amount);










r.close();
    }
}