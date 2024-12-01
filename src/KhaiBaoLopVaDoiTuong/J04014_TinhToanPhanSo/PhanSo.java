/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04014_TinhToanPhanSo;

import java.util.*;
public class PhanSo {
    private long tu, mau;
    //
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    //
    public long ucln(long a, long b){
        if(b==0) return a;
        return ucln(b, a%b);
    }
    //
    public long getTu(){
        return tu;
    }
    //
    public long getMau(){
        return mau;
    }
    //
    public void rutGon(){
        long uc = ucln(this.tu,this.mau);
        this.tu = this.tu/uc;
        this.mau = this.mau/uc;
    }
    //
    public String toString(){
        return tu+"/"+mau;
    }
}
