package VaoRaFile.J07053_XetTuyen;
import java.io.*;
import java.util.*;
public class NewMain {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("XETTUYEN.in"));
        ArrayList<UngVien> dsuv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            UngVien ungvien = new UngVien(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            dsuv.add(ungvien);
        }
        for(UngVien x:dsuv){
            System.out.println(x);
        }
    }
    
}
