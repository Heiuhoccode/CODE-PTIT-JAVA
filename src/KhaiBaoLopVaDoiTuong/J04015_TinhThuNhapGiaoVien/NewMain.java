/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04015_TinhThuNhapGiaoVien;

import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ID = sc.nextLine();
        String Name = sc.nextLine();
        long Salary_base = sc.nextLong();
        GiaoVien A = new GiaoVien(ID, Name, Salary_base);
        System.out.println(A);
    }
    
}
//HP04
//Tran Quoc Huy
//1578000