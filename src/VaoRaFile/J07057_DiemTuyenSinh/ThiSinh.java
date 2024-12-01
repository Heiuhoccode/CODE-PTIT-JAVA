
package VaoRaFile.J07057_DiemTuyenSinh;

import java.util.*;
public class ThiSinh implements Comparable<ThiSinh>{
    private String id="TS", name, nation, status;
    private double score, totalScore;
    private int region;
    //
    public ThiSinh(int i, String name, double score, String nation, int region){
        this.id = String.format("%s%02d", this.id, i);
        this.name = changeName(name);
        this.score = score;
        this.nation = nation;
        this.region = region;
        this.totalScore = score + PriorScore(nation,region);
        this.status = Status(totalScore);
        
    }
    //
    public String changeName(String name){
        String newFullName = "";
        String[] partName = name.trim().toLowerCase().split("\\s+");
        for(String partname:partName){
            String newPartName = String.valueOf(partname.charAt(0)).toUpperCase() + partname.substring(1).toLowerCase();
            newFullName += newPartName +" ";
        }
        newFullName = newFullName.trim();
        return newFullName;    
    }
    public String Status(double totalScore){
        
        if(totalScore>=20.5){
            return "Do";
        }
        return "Truot";
    }
    public Double PriorScore(String nation, int region){
        double priorScore = 0.0;
        if(nation.equals("Kinh")) priorScore += 0.0;
        if(!nation.equals("Kinh")) priorScore += 1.5;
        if(region == 1) priorScore += 1.5;
        if(region == 2) priorScore += 1.0;
        if(region == 3) priorScore += 0.0;
        
        return priorScore;
    }
    public int compareTo(ThiSinh other){
        if(this.totalScore == other.totalScore){
            return this.id.compareTo(other.id);
        }
        return Double.compare(other.totalScore, this.totalScore);
    }
    public String toString(){
        return id + " " + name + " " + String.format("%.1f", totalScore) + " " + status;
    }
}
