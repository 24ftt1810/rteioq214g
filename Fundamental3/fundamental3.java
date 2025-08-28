import java.util.Scanner;

public class fundamental3 {
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);
    //     int maxnum=100;
    //    int rand = (int)(Math.random()*(maxnum+1));
    //     int rand1 = (int)(Math.random()*(maxnum+1));
    //     System.out.println(rand+"+"+rand1);
  
    //     int ans=input.nextInt();
    //    String truth=ans==rand+rand1==true?"true":"false";

    // System.out.println(rand+"+"+rand1+" = "+truth);

    //    System.out.println(rand+"%"+rand1);
    //    int ans2=input.nextInt();

    //    String truth2=ans2==rand%rand1==true?"true":"false";



    //  System.out.println(rand+"%"+rand1+" = "+truth2);


        System.out.println("Enter three Cordinates for Triangle ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
    
 

              
      double Side1=Math.sqrt(Math.pow( (x2-x1), 2)+(Math.pow( (y2-y1),2))) ;
      double Side2=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
      double Side3=Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));

        double s=(Side1+Side2+Side3)/2;
        double area=Math.sqrt((s*(s-Side1)*(s-Side2)*(s-Side3)));
       System.out.printf("The area of the triangle is   %.1f%n",area);

        System.out.println("Enter an Integer between 100 and 999 ");
        int No=input.nextInt();
        int first=No%10;
        int second=No/10;
        String An=String.valueOf(first);
        An+=String.valueOf(second);
        System.out.println("The reverse of "+No+" is "+An);



        System.out.println("Enter 1 to convert bnd to rm and 2 vise versa: ");
        int option=input.nextInt();
        System.out.println("Enter the amount to be converted: $ ");
        double money=input.nextDouble();
        double changemoney=option==1?money*3:money/3;
        System.out.printf("The area of the triangle is   %.2f%n",changemoney);

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


    }
}
