/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2;

public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String id, name;
    private int countSV;
    //
    public DoanhNghiep(String id, String name, int countSV){
        this.id = id;
        this.name = name;
        this.countSV = countSV;
    }
    //

    public int getCountSV() {
        return countSV;
    }
    
    public int compareTo(DoanhNghiep other){
        if(this.countSV==other.countSV){
            return this.id.compareTo(other.id);
        }
        return other.countSV - this.countSV;
    }
    //
    public String toString(){
        return id + " " + name + " " + countSV;
    }
}
