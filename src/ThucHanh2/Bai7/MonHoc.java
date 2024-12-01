/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2.Bai7;

import java.util.*;
public class MonHoc implements Comparable<MonHoc>{
    private String id, name, exam;
    //
    public MonHoc(String id, String name, String exam){
        this.exam = exam;
        this.id =id; 
        this.name = name;
    }
    //
    public int compareTo(MonHoc other){
        return this.id.compareTo(other.id);
    }
    //
    public String toString(){
        return id + " " + name +" " + exam;
    }
}
