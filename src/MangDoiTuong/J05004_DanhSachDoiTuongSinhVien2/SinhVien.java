/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05004_DanhSachDoiTuongSinhVien2;

import java.util.*;
public class SinhVien {
    private String ID="B20DCCN", Name, Clas, DateOB;
    private double GPA;
    //
    public SinhVien(int id, String Name, String Clas, String DateOB, double GPA){
        this.ID = String.format("%s%03d", this.ID, id);
        this.Clas = Clas;
        this.DateOB = ChangeDate(DateOB);
        this.GPA = GPA;
        this.Name = ChangeName(Name);
    }
    //
     public static String ChangeName(String s){
        String newFullName = "";
        String[] fullName = s.trim().toLowerCase().split("\\s+");
        for(String x:fullName){
            String partName = String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1).toLowerCase();
            newFullName += partName + " ";
        }
        newFullName = newFullName.trim();
        return newFullName;
    }
    //
    public static String ChangeDate(String DateOB){
        DateOB.trim();
        String[] date = DateOB.split("/");
        if(date[0].length()==1){
            date[0] = "0" + date[0];
        }
        if(date[1].length()==1){
            date[1] = "0" + date[1];
        }
        String NewDate = "";
        NewDate = date[0] + "/" + date[1] + "/" + date[2];
        return NewDate;
    }
    //
    public String toString(){
        return ID + " " + Name + " " + Clas + " " +DateOB + " " + String.format("%.2f",GPA);
    }
}

