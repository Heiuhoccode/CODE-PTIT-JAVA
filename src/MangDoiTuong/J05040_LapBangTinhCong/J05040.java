/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05040_LapBangTinhCong;

import java.util.*;
public class J05040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            NhanVien nv = new NhanVien(i, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
            dsnv.add(nv);
        }
        Collections.sort(dsnv);
        for(NhanVien nv:dsnv){
            System.out.println(nv);
        }
        
    }
    
}
//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV