import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args){
        Scanner r=new Scanner(System.in);

System.out.println("Each durian cost $15.75");
System.out.println("How much money do you have? ");
double money=r.nextDouble();
int nodurian=(int) (money/15.75);
System.out.println("The number of durian(s) you can buy is "+nodurian);

r.close();
}
}