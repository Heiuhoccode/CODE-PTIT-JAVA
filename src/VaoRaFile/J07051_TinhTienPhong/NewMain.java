/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07051_TinhTienPhong;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        ArrayList<KhachHang> dskh = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            int id = i;
            String name = sc.nextLine();
            int room = sc.nextInt();sc.nextLine();
            String checkin = sc.nextLine();
            String checkout  = sc.nextLine();
            int additionFee = sc.nextInt();
            KhachHang khachhang = new KhachHang(id, name, room, checkin, checkout, additionFee);
            dskh.add(khachhang);
        }
        Collections.sort(dskh);
        for(KhachHang x:dskh){
            System.out.println(x);
        }
    }
    
}
