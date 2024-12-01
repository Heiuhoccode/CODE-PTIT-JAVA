/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07034_DanhSachMonHoc;

import java.util.*;
public class MonHoc implements Comparable<MonHoc>{
    private String ID, Name;
    private int Unit;
    //
    public MonHoc(String ID, String Name, int Unit){
        this.ID = ID;
        this.Name = Name;
        this.Unit = Unit;
    }
    //
    public int compareTo(MonHoc other){
        return this.Name.compareTo(other.Name);
    }
    //
    public String toString(){
        return ID + " " + Name + " " + Unit;
    }
}
