
package VaoRaFile.J07055_XepLoai;

import java.util.*;
public class SinhVien implements Comparable<SinhVien>{
    private String id = "SV", name;
    private double score1, score2, score3, avgScore;
    private String rank;
    //
    public SinhVien(int i, String name, double score1, double score2, double score3){
        this.id = String.format("%s%02d", this.id, i);
        this.name = changeName(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.avgScore = (score1*0.25 + score2*0.35 + score3*0.4); 
        this.rank = Rank(this.avgScore);
    }
    //
//    public double getAvgScore(){
//        return avgScore;
//    }
    //
//    public void setRank(int rank){
//        this.rank = rank;
//    }
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
    public String Rank(double avgScore){
        if(avgScore>=5){
            if(avgScore >=6.5){
                if(avgScore >= 8){
                    return "GIOI";
                }
                return "KHA";
            }
            return "TRUNG BINH";
        }
        return "KEM";
    }
    //
    public int compareTo(SinhVien other){
//        if(this.avgScore == other.avgScore){
//            return this.id.compareTo(other.id);
//        }
        return Double.compare(other.avgScore,this.avgScore);
    }
    //
    public String toString(){
        return String.format("%s %s %.2f %s", id, name, avgScore, rank);
    }
}
