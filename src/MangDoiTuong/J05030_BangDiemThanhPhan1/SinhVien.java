/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05030_BangDiemThanhPhan1;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien>{
    private String id, name, clas;
    private double score1,score2,score3;
    //
    public SinhVien(String id, String name, String clas, double score1, double score2, double score3){
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    //
    public int compareTo(SinhVien other){
        return this.id.compareTo(other.id);
    }
    //
    public String toString(){
        return id + " " + name + " " + clas + " " + score1 + " "  + score2 + " " + score3;
    }
}
