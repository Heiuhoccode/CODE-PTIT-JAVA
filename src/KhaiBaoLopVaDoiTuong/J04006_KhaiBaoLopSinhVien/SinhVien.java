/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04006_KhaiBaoLopSinhVien;

import java.util.*;
public class SinhVien {
    private String ID, Name, Clas, DateOB;
    private float GPA;
    //
    public String getID(){
        return "B20DCCN001";
    }
    public String getName(){
        return Name;
    }
    public String getClas(){
        return Clas;
    }
    public String getDateOB(){
        return DateOB;
    }
    public float getGPA(){
        return GPA;
    }
    //
    public SinhVien(String Name, String Clas, String DateOB, float GPA){
        this.Clas = Clas;
        this.DateOB = DateOB;
        this.GPA = GPA;
        this.Name = Name;
    }
    //
    public static String Edit(String DateOB){
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
        return String.format("%s %s %s %s %.2f", getID(), getName(), getClas(), Edit(getDateOB()), getGPA());
    }
}
