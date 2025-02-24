/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05003_DanhSachDoiTuongSinhVien1;

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
        this.Name = Name;
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

