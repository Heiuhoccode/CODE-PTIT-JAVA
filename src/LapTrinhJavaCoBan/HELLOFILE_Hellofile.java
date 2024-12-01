
package LapTrinhJavaCoBan;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class HELLOFILE_Hellofile {
    public static void main(String[] args) {
        String nameFile = "src/LapTrinhJavaCoBan/Hello.txt";
        try (BufferedReader temp = new BufferedReader(new FileReader(nameFile))){
            String line;
            while((line = temp.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
