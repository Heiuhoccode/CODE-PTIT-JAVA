/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04004_TongPhanSo;

import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 =sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();
        PhanSo p = new PhanSo(tu1,mau1);
        p=p.ToiGian();
        PhanSo q = new PhanSo(tu2,mau2);
        q=q.ToiGian();
        PhanSo Sum = p.Tong(q);
        Sum=Sum.ToiGian();
        System.out.println(Sum);
    }
    
}
