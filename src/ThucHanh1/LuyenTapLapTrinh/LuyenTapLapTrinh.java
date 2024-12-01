
package ThucHanh1.LuyenTapLapTrinh;
import java.util.*;
import java.io.*;


public class LuyenTapLapTrinh {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        ArrayList<Stu> HS = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            String Ten = sc.nextLine();
            int AC = sc.nextInt();
            int Submit = sc.nextInt();
            Stu temp = new Stu(Ten,AC,Submit);
            HS.add(temp);
        }
        Collections.sort(HS);
        for(Stu i:HS){
            System.out.println(i);
        }
    }
}
