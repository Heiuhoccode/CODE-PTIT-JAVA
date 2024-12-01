/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05018_BangDiemHocSinh;

import java.util.*;
public class HocSinh implements Comparable<HocSinh>{
    private String id="HS", name, rank;
    private double score1, score2, score3, score4, score5, score6, score7, score8, score9, score10;
    //
    public HocSinh(int id, String name, double score1, double score2, double score3, double score4, double score5, double score6, double score7, double score8, double score9, double score10){
        this.id = String.format("%s%02d", this.id, id);
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
        this.score6 = score6;
        this.score7 = score7;
        this.score8 = score8;
        this.score9 = score9;
        this.score10 = score10;
    }
    //
    public double getAVGScore(){
        double avgScore = (score1*2 + score2*2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10)/12;
        return ((double) Math.ceil(avgScore*100) /100);
    }
    //
    public String getRank(){
        double avgScore = (score1*2 + score2*2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10)/12;
        if(avgScore >= 9) return "XUAT SAC";
        if(avgScore >= 8) return "GIOI";
        if(avgScore >= 7) return "KHA";
        if(avgScore >= 5) return "TB";
        return "YEU";
    }
    //
    public int compareTo(HocSinh other){
        if(other.getAVGScore()==this.getAVGScore()){
            return this.id.compareTo(other.id);
        }
        return Double.compare(other.getAVGScore(), this.getAVGScore());
    }
    //
    public String toString(){
        return String.format("%s %s %.1f %s", id,name,getAVGScore(),getRank());
    }
}
