import java.util.Scanner;

public class ConvertBytesIntoBits {
     public static void main(String[] args){
        Scanner r=new Scanner(System.in);

        System.out.println("Enter number of byte");
int i=r.nextInt();
System.out.println(i+" byte(s) is "+(i*8)+" bits");
r.close();
}

}