/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05022_LietKeSinhVienTheoLop;

import java.util.*;
public class J05022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dssv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            dssv.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        int req = Integer.parseInt(sc.nextLine());
        while(req-- > 0){
            String request = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + request+":");
            for(SinhVien sv:dssv){
                if(sv.getClas().equals(request)){
                    System.out.println(sv);
                }
                
            }    
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//D15CQKT02-B