/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07045_LoaiPhong;

import java.io.*;
import java.util.*;
public class LoaiPhong implements Comparable<LoaiPhong>{
    private String typeCode, typeName;
    private long prices;
    private double serviceFee;
    //
    public LoaiPhong (String input){
        String[] in = input.split("\\s+");
        this.prices = Integer.valueOf(in[2]);
        this.serviceFee = Double.valueOf(in[3]);
        this.typeCode = in[0];
        this.typeName = in[1];
    }
    //
    public int compareTo(LoaiPhong other){
        return this.typeName.compareTo(other.typeName);
    }
    //
    public String toString(){
        return typeCode + " " + typeName + " " + prices + " " + serviceFee;
    }
    //
}
