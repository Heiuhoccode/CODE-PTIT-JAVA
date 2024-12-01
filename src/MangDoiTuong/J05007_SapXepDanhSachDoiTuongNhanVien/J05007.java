/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05007_SapXepDanhSachDoiTuongNhanVien;

import java.util.*;
public class J05007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=t; i++){
            String Name = sc.nextLine();
            String Sex = sc.nextLine();
            String DateOB = sc.nextLine();
            String Address = sc.nextLine();
            String TaxID = sc.nextLine();
            String DateOC = sc.nextLine();
            dsnv.add(new NhanVien(i,Name,Sex,DateOB, Address, TaxID, DateOC));
        }
        Collections.sort(dsnv);
        for(NhanVien nv:dsnv){
            System.out.println(nv);
        }
    }
    
}
