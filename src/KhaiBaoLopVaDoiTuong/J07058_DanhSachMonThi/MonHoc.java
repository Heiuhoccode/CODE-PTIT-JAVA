/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J07058_DanhSachMonThi;

/**
 *
 * @author admin
 */
public class MonHoc implements Comparable<MonHoc> {
    private String ID;
    private String Name;
    private String ExamForm;
    
    public MonHoc (String ID, String Name, String ExamForm){
        this.ID = ID;
        this.Name = Name;
        this.ExamForm = ExamForm;
    }
    
    public String getID(){
        return this.ID;
    }
    public String getName(){
        return this.Name;
    }
    public String getExamForm(){
        return this.ExamForm;
    }    
    
    public int compareTo(MonHoc other){
        return this.ID.compareTo(other.ID);
    }
    
    public String toString(){
        return ID + " " + Name + " " + ExamForm;
    }
}
