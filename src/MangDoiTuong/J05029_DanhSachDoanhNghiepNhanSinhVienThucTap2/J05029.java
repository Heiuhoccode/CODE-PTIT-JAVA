/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2;


import java.util.*;
public class J05029 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> dsdn = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            dsdn.add(new DoanhNghiep(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(dsdn);
        int req = Integer.parseInt(sc.nextLine());
        while(req-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep x:dsdn){
                if(x.getCountSV()>=a && x.getCountSV()<=b){
                    System.out.println(x);    
                }
                
            }    
        }
        
    }
}

//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50