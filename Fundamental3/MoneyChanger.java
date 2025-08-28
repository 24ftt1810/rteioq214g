import java.util.Scanner;

public class MoneyChanger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to convert bnd to rm and 2 vise versa: ");
        int option=input.nextInt();
        System.out.println("Enter the amount to be converted: $ ");
        double money=input.nextDouble();
        double changemoney=option==1?money*3:money/3;
        System.out.printf("The area of the triangle is   %.2f%n",changemoney);
        input.close();
    }
}
