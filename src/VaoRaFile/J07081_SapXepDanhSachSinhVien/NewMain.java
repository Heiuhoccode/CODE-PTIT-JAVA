
package VaoRaFile.J07081_SapXepDanhSachSinhVien;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> dssv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            SinhVien sinhvien = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            dssv.add(sinhvien);
        }
        Collections.sort(dssv);
        for(SinhVien sv:dssv){
            System.out.println(sv);
        }
    }
    
}
