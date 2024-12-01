
package VaoRaFile.J07084_ThoiGianOnlineLienTuc;
import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        ArrayList<SinhVien> dssv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            dssv.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(dssv);
        for(SinhVien sinhvien:dssv){
            System.out.println(sinhvien);
        }
    }
    
}
