
package VaoRaFile.J07054_TinhDiemTrungBinh;

import java.text.DecimalFormat;
import java.util.*;
public class SinhVien implements Comparable<SinhVien>{
    private String id = "SV", name;
    private double score1, score2, score3, avgScore;
    private int rank;
    //
    public SinhVien(int i, String name, double score1, double score2, double score3){
        this.id = String.format("%s%02d", this.id, i);
        this.name = changeName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.avgScore = (score1*3 + score2*3 + score3*2)/8;        
    }
    //
    public double getAvgScore(){
        return avgScore;
    }
    //
    public void setRank(int rank){
        this.rank = rank;
    }
    //
    public static String changeName(String name){
        String newFullName = "";
        String[] partName = name.trim().toLowerCase().split("\\s+");
        for(String partname:partName){
            String newPartName = String.valueOf(partname.charAt(0)).toUpperCase() + partname.substring(1).toLowerCase();
            newFullName += newPartName + " ";
        }
        newFullName = newFullName.trim();
        return newFullName;
    }
    //
    public void Rank(double priorAvgScore, int priorRank, int currentlyRank){
        if(this.avgScore == priorAvgScore){
            this.rank = priorRank;
        }
        else{
            this.rank = currentlyRank;
        }
    }
    //
    public int compareTo(SinhVien other){
        if(this.avgScore == other.avgScore){
            return this.id.compareTo(other.id);
        }
        return Double.compare(other.avgScore,this.avgScore);
    }
    //
//    public static Double removeZero(double number) {
//        return Double.parseDouble(String.format("%.2f", number));
//    }
    //
    public String toString(){
        return String.format("%s %s %.2f %d", id, name, avgScore, rank);
    }
}
