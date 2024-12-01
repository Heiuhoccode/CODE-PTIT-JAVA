/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04007_KhaiBaoLopNhanVien;

import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        String Sex = sc.nextLine();
        String DateOB = sc.nextLine();
        String Address = sc.nextLine();
        String TaxID = sc.nextLine();
        String DateOC = sc.nextLine();
        NhanVien A = new NhanVien(Name,Sex,DateOB, Address, TaxID, DateOC);
        System.out.println(A);
    }
    
}
//Nguyen Van Hoa
//Nam
//22/11/1982
//Mo Lao-Ha Dong-Ha Noi
//8333123456
//31/12/2013