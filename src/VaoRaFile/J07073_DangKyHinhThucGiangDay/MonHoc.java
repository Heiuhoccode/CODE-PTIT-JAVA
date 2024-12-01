
package VaoRaFile.J07073_DangKyHinhThucGiangDay;


import java.io.*;
import java.util.*;
public class MonHoc implements Comparable<MonHoc>{
    private String id, name, theoryExam, practicalExam;
    private int credits;
    //
    public MonHoc(String id, String name, int credits, String theoryExam, String practicalExam){
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.theoryExam = theoryExam;
        this.practicalExam = practicalExam;        
    }
    //
    public String getPracticalExam(){
        return practicalExam;
    }
    //
    public int compareTo(MonHoc other){
        return this.id.compareTo(other.id);
    }
    //
    public String toString(){
        return id + " " + name + " " + credits + " " + theoryExam + " " + practicalExam;
    }
}
