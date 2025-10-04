public class LoopsLoopsLoops {
   public static void main(String[] args) {
   int a=0;
   int b=50;
  
    System.out.println("Below is generated using while loop:");

while (a<=20) {
System.out.print(a+" ");
    a++;
}

System.out.println("\n"+"Below is generated using dowhile loop:");
do {
System.out.print(b+" "); 
b--;     
} while (b>=35);

System.out.println("\n"+"Below is generated using for loop:");
for (int i = 97; i <= 122; ++i) {
    char k=(char)i;
    System.out.print(k+" ");
    
}

   } 
}
