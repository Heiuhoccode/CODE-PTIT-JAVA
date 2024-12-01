/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07010_DanhSachSinhVienTrongFile2;

import java.time.format.DateTimeFormatter;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String ID = "B20DCCN",Name,DateOB, Clas;
    private float GPA;
    //
    public SinhVien (int ID, String Name,  String Clas,String DateOB, float GPA){
        this.ID = String.format("%s%03d", this.ID, ID);
        this.Name = Name;
        this.DateOB = DateOB;
        this.Clas = Clas;
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getDateOB() {
        return Edit(DateOB);
    }

    public String getClas() {
        return Clas;
    }

    public float getGPA() {
        return GPA;
    }
    
    public static String Edit(String DateOB){
        DateOB = DateOB.trim();
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
    //
    public String toString(){
        return String.format("%s %s %s %s %.2f", ID, Name, Clas, getDateOB(),GPA);
    }
}
