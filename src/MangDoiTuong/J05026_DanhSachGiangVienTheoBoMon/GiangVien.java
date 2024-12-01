/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05026_DanhSachGiangVienTheoBoMon;

public class GiangVien {
    private String id="GV", name, major;
    //
    public GiangVien(int id, String name, String major){
        this.id = String.format("%s%02d", this.id, id);
        this.name = name;
        this.major = Major(major);
    }
    //
    public String getMajor(){
        return major;
    }
    //
    public String Major(String s){
        String[] temp = s.trim().toUpperCase().split("\\s+");
        String rs = "";
        for(String x:temp){
            rs += String.valueOf(x.charAt(0));
        }
        return rs;
    }
    //
    public String getName(){
        
        String[] temp = this.name.trim().split("\\s+");
        return temp[temp.length-1];
    }
    //
//    public int compareTo(GiangVien other){
//        return this.getName().compareTo(other.getName());
//    }
    //
    public String toString(){
        return id + " " + name + " " + major;
    }
}
