import java.util.Scanner;

public class AreaOfTriangleGeometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
       input.close();
    }
}
