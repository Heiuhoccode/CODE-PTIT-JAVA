
package VaoRaFile.J07053_XetTuyen;

import java.util.*;
public class UngVien {
    private String id="PH", name, date, rank;
    private int old, avgScore;
    private double theoryScore, practicalScore, bonusScore;
    //
    public UngVien(int i, String name, String date, double theoryScore, double practicalScore){
        this.id = String.format("%s%02d", this.id, i);
        this.name = changeName(name);
        this.date = date;
        this.old = Old(this.date);
        this.theoryScore = theoryScore;
        this.practicalScore = practicalScore;
        this.bonusScore = BonusScore(theoryScore, practicalScore);
        this.avgScore = AVGScore(this.theoryScore, this.practicalScore, this.bonusScore);
        this.rank = Rank(this.avgScore);
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
    public static int Old(String date){
        date = date.trim();
        String[] partDate = date.split("/");
        return (int)(2021 - Integer.parseInt(partDate[2]));
    }
    //
    public static Double BonusScore(double theoryScore, double practicalScore){
        if(theoryScore >= 7.5 && practicalScore >= 7.5){
            if(theoryScore >= 8 && practicalScore >= 8){
                return 1.0;
            }
            return 0.5;
        }
        return 0.0;
    }
    //
    public static int AVGScore(double theoryScore, double practicalScore, double bonusScore){
        double avgScore = (theoryScore + practicalScore)/2 + bonusScore;
        int result = Math.round((float)avgScore);
        if(result > 10){
            return 10;
        }
        return result;
    }
    public static String Rank(int avgScore){
        if(avgScore < 5) return "Truot";
        if(avgScore == 5 || avgScore == 6) return "Trung binh";
        if(avgScore == 7) return "Kha";
        if(avgScore == 8) return "Gioi";
        return "Xuat sac";
    }
    //
    public String toString(){
        return id  + " " + name + " " + old + " " + avgScore + " " + rank;
    }
}
