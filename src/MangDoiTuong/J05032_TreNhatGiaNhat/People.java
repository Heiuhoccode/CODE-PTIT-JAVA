/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05032_TreNhatGiaNhat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author admin
 */
public class People implements Comparable<People>{
    private String name;
    private LocalDate date;
    //
    public People(String name, String date){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.name = name;
        this.date = LocalDate.parse(date, format);
    }
    //
    public int compareTo(People other){
        return this.date.isBefore(other.date) ? 1 : -1;
    }
    //
    public String toString(){
        return name;
    }
}
