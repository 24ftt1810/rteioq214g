import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModulusQuestion {
 public static void main(String[] args) throws IOException{
    new File("C:\\Users\\mdsya\\OneDrive\\Desktop\\pratical 5" ).mkdir();
    FileWriter writer=new FileWriter("C:\\Users\\mdsya\\OneDrive\\Desktop\\pratical 5\\Modulus Question.txt",true);
    int random=(int)(Math.random()*100);
    int rando=(int)(Math.random()*100);
    writer.write(random+"+"+rando+"=  ?"+"\r\n");
    writer.close();
   } 
}
