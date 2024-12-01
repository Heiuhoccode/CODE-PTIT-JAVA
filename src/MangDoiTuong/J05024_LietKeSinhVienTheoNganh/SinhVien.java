/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05024_LietKeSinhVienTheoNganh;


public class SinhVien {
    private String id, name, clas, email;
    //
    public SinhVien(String id, String name, String clas, String email){
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
    }
    //
    public String getMajor(){
        String major = id.substring(3, 7);
        if(major.equals("DCKT")){
            return "KE TOAN";
        }
        if(major.equals("DCCN") && clas.charAt(0)!='E'){
            return "CONG NGHE THONG TIN";
        }
        if(major.equals("DCAT") && clas.charAt(0)!='E'){
            return "AN TOAN THONG TIN";
        }
        if(major.equals("DCVT")){
            return "VIEN THONG";
        }
        if(major.equals("DCDT")){
            return "DIEN TU";
        }
        return "";
    }
//    public int compareTo(SinhVien other){
//        if(this.clas.equals(other.clas)){
//            return this.id.compareTo(other.id);
//        }
//        return this.clas.compareTo(other.clas);
//    }
    //
    public String toString(){
        return id + " " + name + " "  + clas + " " + email;
    }
}



