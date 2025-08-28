import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
              System.out.println("Enter the price of the 1st package: $");
        double price=input.nextDouble();
         System.out.println("Enter the weight of the 1st package in gram: ");
        double weight=input.nextDouble();
             System.out.println("Enter the price of the 2st package: $");
        double price1=input.nextDouble();
                System.out.println("Enter the weight of the 2st package in gram: ");
        double weight1=input.nextDouble();
        double Offer1=weight/price;
        double Offer=weight1/price1;
        String Worth=Offer<Offer1?"It is worth more to buy the 1st package":"It is worth more to buy the 2st package";
        System.out.println(Worth);
        input.close();
    }
}
