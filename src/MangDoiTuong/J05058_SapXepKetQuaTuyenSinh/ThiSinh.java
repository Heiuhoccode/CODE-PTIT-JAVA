/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05058_SapXepKetQuaTuyenSinh;

import java.text.DecimalFormat;
import java.util.*;
public class ThiSinh implements Comparable<ThiSinh>{
    private String id, name, status;
    private double toan, ly, hoa, uuTien, tongDiem;
    //
    public ThiSinh(String id, String name, double toan, double ly, double hoa){
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.uuTien = XetUuTien(id);
        this.tongDiem = toan*2 + ly + hoa +uuTien;
    }
    //
    public double getTongDiem(){
        return tongDiem;
    }
    //
    public String Status(double diemChuan){
        if((this.tongDiem ) >= diemChuan){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
//    //
//    public static String ChangeName(String s){
//        String newFullName = "";
//        String[] fullName = s.trim().toLowerCase().split("\\s+");
//        for(String x:fullName){
//            String partName = String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1).toLowerCase();
//            newFullName += partName + " ";
//        }
//        newFullName = newFullName.trim();
//        return newFullName;
//    }
    //
    public static double XetUuTien(String id){
        String khuVuc = id.substring(0,3);
        if(khuVuc.equals("KV1")){
            return 0.5;
        }
        if(khuVuc.equals("KV2")){
            return 1.0;
        }
        if(khuVuc.equals("KV3")){
            return 2.5;
        }
        return 0;
    }
    
    //
    public static String removeZero(double number) {
        DecimalFormat format = new DecimalFormat("#.#");
        return format.format(number);
    }
    //
    public int compareTo(ThiSinh other){
        if(this.tongDiem == other.tongDiem){
            return this.id.compareTo(other.id);
            
        }
        return Double.compare(other.tongDiem, this.tongDiem);
    }
    //
    public String toString(){
        return id + " " + name + " " + removeZero(uuTien) + " " + removeZero(tongDiem) + " " + Status(24.0);
    }
}



