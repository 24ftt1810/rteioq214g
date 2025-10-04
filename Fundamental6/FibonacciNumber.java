import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c=0;
        int d=1;
        int g=0;
        int to=0;
        int f=0;
        System.out.println("Please enter the term: ");
        int a =input.nextInt();
        while (true) {
            if (a==1){
            to+=d;
                break;
            }
            
             if (g!=a){
            to=0;
      if (g%2==0) {
        f=c;
                c=c+d;
                to+=c-f;
              g++;  
            }
            else {
                f=d;
                d=c+d;
                to+=d-f;
                g++;
            }
            }
            else {
                break;
            }
        }
        System.out.println("At term "+a+" the number is "+to);
        input.close();
    }
}
