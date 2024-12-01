/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07037_DanhSachDoanhNghiep;

import java.io.*;
import java.util.*;
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String ID, Name;
    private int CntSV;
    //
    public DoanhNghiep(String ID, String Name, int CntSV){
        this.CntSV = CntSV;
        this.ID = ID;
        this.Name = Name;
    }
    //
    public int compareTo( DoanhNghiep other){
        return ID.compareTo(other.ID);
    }
    //
    public String toString(){
        return ID + " " + Name + " " + CntSV;
    }
}
