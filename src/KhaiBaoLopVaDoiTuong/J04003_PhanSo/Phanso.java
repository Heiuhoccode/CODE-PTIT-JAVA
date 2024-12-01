/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04003_PhanSo;

/**
 *
 * @author admin
 */
public class Phanso {
    private long tu, mau;
    //
    public Phanso(long tu, long mau){
        this.mau = mau;
        this.tu = tu;
    }
    //
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    //
    public long UCLN(long a, long b){
        if(b==0) return a;
        return UCLN(b, a%b);
    }
    //
    public Phanso ToiGian(){
        Phanso temp = this;
        long uc = UCLN(temp.tu, temp.mau);
        temp.tu /= uc;
        temp.mau /= uc;
        return temp;
    }
    //
    public String toString(){
        return getTu() + "/" + getMau();
    }
}
