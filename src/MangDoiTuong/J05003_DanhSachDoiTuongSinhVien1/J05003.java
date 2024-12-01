/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05003_DanhSachDoiTuongSinhVien1;

import java.util.*;
public class J05003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        for(int i=1; i<=t; i++){
            dssv.add(new SinhVien(i, sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine())));
        }
        for(SinhVien sv:dssv){
            System.out.println(sv);
        }
    }
    
}
//1
//Nguyen Van An
//D20CQCN01-B
//2/12/2002
//3.19