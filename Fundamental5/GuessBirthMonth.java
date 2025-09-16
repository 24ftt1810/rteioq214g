import java.util.Scanner;

public class GuessBirthMonth {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Is your birth month in Set 1? \n"+"1 3 5 7 11");
    System.out.print("Enter 0 for No and 1 for Yes: ");
    String A =input.nextLine();
     System.out.println("Is your birth month in Set 2? \n"+"2 3 6 7 11");
    System.out.print("Enter 0 for No and 1 for Yes: ");
    A +=input.nextLine();
    System.out.println("Is your birth month in Set 3? \n"+"1 3 5 7 11");
    System.out.print("Enter 0 for No and 1 for Yes: ");
     A +=input.nextLine();
    System.out.println("Is your birth month in Set 4? \n"+"1 3 5 7 11");
    System.out.print("Enter 0 for No and 1 for Yes: ");
     A +=input.nextLine();
    int b =Integer.parseInt(A);
    System.out.println(b);
   switch (b) {
    case 1010:
        System.out.println("You are born in October");
        break;
        case 1:
        System.out.println("You are born in January");
        break;
           case 10:
        System.out.println("You are born in Febuary");
        break;
       case 11:
        System.out.println("You are born in March");
        break;

       case 100:
        System.out.println("You are born in April");
        break;
       case 101:
        System.out.println("You are born in May");
        break;
       case 110:
        System.out.println("You are born in June");
        break;
       case 111:
        System.out.println("You are born in July");
        break;
       case 1000:
        System.out.println("You are born in August");
        break;
       case 1001:
        System.out.println("You are born in September");
        break;
       case 1011:
        System.out.println("You are born in November");
        break;
    case 1100:
    System.out.println("You are born in December ");
break;



    default:
    System.out.println("Not one of the month");
        break;
   }

input.close();




} 
}

