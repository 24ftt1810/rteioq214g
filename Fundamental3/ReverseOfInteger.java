import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Enter an Integer between 100 and 999 ");
        int No=input.nextInt();
        int first=No%10;
        int second=No/10;
        String An=String.valueOf(first);
        An+=String.valueOf(second);
        System.out.println("The reverse of "+No+" is "+An);
        input.close();

    }
}
