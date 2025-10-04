import java.util.Scanner;

public class OccurrenceOfMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amo=0;
        int lar=1;
        int d=0;
        System.out.println("Enter numbers, the input ends with 0 entered:");
        while (true) {
            d=input.nextInt();
            if(d!=0){
            if (lar<=d) {
       
               
                if (lar!=d) {
                    amo=0; 
                }
                lar=d;
                amo++;
            }
        }
            else {
                break;
            }

        
        }
        System.out.println("The largest number is "+lar);
        System.out.println("The occurrence count of the largest number is "+amo);
    
    
    
    
    }
    
}
