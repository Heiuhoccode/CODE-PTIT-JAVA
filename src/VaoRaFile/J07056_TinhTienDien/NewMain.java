package VaoRaFile.J07056_TinhTienDien;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        ArrayList<KhachHang> dskh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            KhachHang khachhang = new KhachHang(i, sc.nextLine(), sc.nextLine());
            dskh.add(khachhang);
        }
        Collections.sort(dskh);
        for(KhachHang temp:dskh){
            System.out.println(temp);
        }
    }
    
}
