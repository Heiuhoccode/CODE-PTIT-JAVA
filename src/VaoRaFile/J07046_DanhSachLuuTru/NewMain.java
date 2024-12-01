/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07046_DanhSachLuuTru;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> dskh = new ArrayList<>();
        for(int i=1; i<=n; i++){
            
            KhachHang khachhang = new KhachHang(i, sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine());
            dskh.add(khachhang);
        }
        Collections.sort(dskh);
        for(KhachHang x:dskh){
            System.out.println(x);
        }
    }
    
}
