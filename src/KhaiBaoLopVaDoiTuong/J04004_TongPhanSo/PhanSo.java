/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04004_TongPhanSo;

/**
 *
 * @author admin
 */
public class PhanSo {
    private long tu,mau;
    //
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    //
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    //
    public long UCLN(long a, long b){
        if(b==0) return a;
        return UCLN(b, a%b);
    }
    public PhanSo ToiGian(){
        PhanSo temp = this;
        long uc = UCLN(temp.tu, temp.mau);
        temp.tu /= uc;
        temp.mau /= uc;
        return temp;
    }
    //
    public PhanSo Tong(PhanSo b){
        PhanSo sum = new PhanSo(1,1);
        PhanSo a = this;
        long bcnn = a.mau*b.mau/UCLN(a.mau, b.mau);
        sum.tu = a.tu * (bcnn/a.mau) + b.tu * (bcnn/b.mau);
        sum.mau = bcnn;
        return sum;
    }
    //
    public String toString(){
        return getTu()+"/"+getMau();
    }
}
