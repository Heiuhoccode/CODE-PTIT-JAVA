/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05022_LietKeSinhVienTheoLop;

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
    public String getClas(){
        return clas;
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
