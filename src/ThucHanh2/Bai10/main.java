/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh2.Bai10;

import java.io.*;
import java.util.*;
import java.text.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        Map<String, SanPham> sp = new HashMap<>();
        ArrayList<KhachHang> dskh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0) {
            SanPham pro = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            sp.put(pro.getId(), pro);
        }
        n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            dskh.add(new KhachHang(sc.nextLine(), sc.nextLine(), sp.get(sc.nextLine()), Integer.parseInt(sc.nextLine()),sc.nextLine()));
        }
        Collections.sort(dskh);
        for(KhachHang x:dskh){
            System.out.println(x);
        }
    }
    
}
