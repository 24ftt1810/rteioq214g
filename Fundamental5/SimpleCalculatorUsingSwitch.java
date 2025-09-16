import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an arithmetic expression ");
    int a =input.nextInt();
    String b=input.next();
    int c=input.nextInt();
    int cal=0;

switch (b) {
    case "+":
    cal=a+c;
     System.out.println(cal);       
        break;
case"-":
cal=a-c;
System.out.println(cal);
break;
case "*":
cal=a*c;
System.out.println(cal);
break;
case"/":
if (c!=0){
cal=a/c;
System.out.println(cal);
}
else{
    System.out.println("Zero cant be the denominator");
}
break;





}


input.close();



















}
}
