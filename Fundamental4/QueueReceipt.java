import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class QueueReceipt {
 public static void main(String[] args) throws IOException{
    new File("C:\\Users\\mdsya\\OneDrive\\Desktop\\pratical 5" ).mkdir();
    FileWriter writer=new FileWriter("C:\\Users\\mdsya\\OneDrive\\Desktop\\pratical 5\\Receipt.txt");
    Scanner input = new Scanner(System.in);

LocalDateTime ldt = LocalDateTime.now();
DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
String ldString=ldt.format(dtf);
int rando=(int)Math.random();
System.out.println("enter name");
String name=input.nextLine().toUpperCase();
    writer.write(ldString+"\r\n");
    writer.write("Hi "+name+"\r\n");
 writer.write("Your Queue No is: "+rando+"\r\n");
    writer.close();
   } 
}