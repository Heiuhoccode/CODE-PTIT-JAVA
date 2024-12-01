/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04014_TinhToanPhanSo;
import java.util.*;
public class J04014 {

    public static PhanSo CalculateC(PhanSo a, PhanSo b){
        long tu = a.getTu()*b.getMau() + a.getMau()*b.getTu();
        long mau = a.getMau() * b.getMau();
        tu = (long) Math.pow(tu, 2);
        mau = (long) Math.pow(mau,2);
        PhanSo c = new PhanSo(tu,mau);
        c.rutGon();
        return c;
    }
    public static PhanSo CalculateD(PhanSo a, PhanSo b, PhanSo c){
        long tu = a.getTu() * b.getTu() * c.getTu();
        long mau = a.getMau() * b.getMau() * c.getMau();
        PhanSo d = new PhanSo(tu,mau);
        d.rutGon();
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            PhanSo A = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo B = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo C = CalculateC(A,B);
            PhanSo D = CalculateD(A,B,C);
            System.out.println(C + " " + D);
        } 
    }
    
}
