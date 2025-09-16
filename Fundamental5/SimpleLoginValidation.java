import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SimpleLoginValidation {
   public static void main(String[] args) {
LocalDateTime ldt = LocalDateTime.now();

DateTimeFormatter dtf=DateTimeFormatter.ofPattern(" HH:mm:ss");
String ldString=ldt.format(dtf);

    System.out.print("Please Enter Your Username");
    Scanner input = new Scanner(System.in);
    String name=input.nextLine();
    System.out.print("Please Enter the password");
    String pass=input.nextLine();
    if (name.equals("Ahmad Ali")){
        if(pass.equals("12345"))
        {
            System.out.println("Welcome."+name+" The time now is "+ldString) ;
        }
        else {
            System.out.println("Error: Password does not match");
        }
    }
    else {
        System.out.println("Error:invalid username ");
    }
input.close();
   } 
}
