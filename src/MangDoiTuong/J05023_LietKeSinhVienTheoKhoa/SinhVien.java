/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05023_LietKeSinhVienTheoKhoa;


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
    public String getAcademicYear(){
        String academicYear = "20" + String.valueOf(clas.charAt(1)) + String.valueOf(clas.charAt(2));
        return academicYear;
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


