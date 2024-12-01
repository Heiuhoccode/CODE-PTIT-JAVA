/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05009_TimThuKhoaCuaKiThi;

import java.util.*;
public class ThiSinh implements Comparable<ThiSinh>{
    private int id;
    private String name, dateOB;
    private double score1, score2, score3;
    //
    public ThiSinh(int id, String name, String dateOB, double score1, double score2, double score3){
        this.id = id;
        this.name = name;
        this.dateOB = dateOB;
        this.score1 = score1; 
        this.score2 = score2;
        this.score3 = score3;
        
    }
    //
    public int compareTo(ThiSinh other){
        return this.id - other.id;
    }
    //
    public double getSum(){
        return (score1+score2+score3);
    }
    //
    public String toString(){
        return id + " " + name + " " + dateOB + " " + String.format("%.1f", score1 + score2 + score3);
    }
}
