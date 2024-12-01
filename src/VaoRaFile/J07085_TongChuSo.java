
package VaoRaFile;
import java.io.*;
import java.util.*;
public class J07085_TongChuSo {
    
    public static String Split(String temp){
        String number="";
        for(int i=0; i<temp.length(); i++){
            if(Character.isDigit(temp.charAt(i))){
                number+=String.valueOf(temp.charAt(i));
            }
        }
        int position = 0;
        while(position < number.length() && number.charAt(position)=='0'){
            position++;
        }
        if(position == number.length()){
            return "0";
        }
        return number.substring(position);
    }
    public static long Sum(String number){
        long sum = 0;
        for(int i=0; i<number.length(); i++){
            sum += number.charAt(i)-'0';
        }
        return sum;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> number = (ArrayList<String>) in.readObject();
        for(String temp:number){
            String partNumber = Split(temp);
            long sum = Sum(partNumber);
            System.out.println(partNumber + " " + sum);
        }
    }
    
}
