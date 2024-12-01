
package VaoRaFile.J07052_DanhSachTrungTuyen;

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class NewMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("THISINH.in"));
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        TreeSet<Double> thangDiem = new TreeSet<>(Comparator.reverseOrder());
        while(n-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            ThiSinh thisinh = new ThiSinh(id,name,toan,ly,hoa);
            dsts.add(thisinh);
            thangDiem.add(thisinh.getTongDiem());
        }
        Collections.sort(dsts);
        int cnt = Integer.parseInt(sc.nextLine());
        double diemChuan = dsts.get(cnt-1).getTongDiem();
        
        System.out.printf("%.1f\n",diemChuan);
        for(ThiSinh x:dsts){
            x.ChangeStatus(diemChuan);
            System.out.println(x);
        }
    }
}