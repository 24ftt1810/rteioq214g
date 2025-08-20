import java.util.Scanner;

public class CharacterToUnicode {
     public static void main(String[] args){
        Scanner r=new Scanner(System.in);


System.out.println("Enter Character");
Character h=r.next().charAt(0);
int w=(int) h;
System.out.println("The Unicode for charcter "+h+" is "+w);

r.close();
}
}