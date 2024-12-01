/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05011_TinhGio;

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
public class GameThu implements Comparable<GameThu>{
    private String id, name;
    private LocalTime timeIn, timeOut;
    //
    public GameThu(String id, String name, String timeIn, String timeOut){
        this.id = id;
        this.name = name;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        this.timeIn = LocalTime.parse(timeIn, format);
        this.timeOut = LocalTime.parse(timeOut, format);
    }
    //
    public long timeUse(LocalTime timeIn, LocalTime timeOut){
        return ChronoUnit.MINUTES.between(timeIn, timeOut);
    }
    //
    public int compareTo(GameThu other){
        return (int)(other.timeUse(other.timeIn, other.timeOut) - this.timeUse(this.timeIn, this.timeOut));
    }
    //
    public String toString(){
        long hours = this.timeUse(this.timeIn, this.timeOut)/60;
        long minutes = this.timeUse(this.timeIn, this.timeOut) % 60;
        return id + " " +
                name + " " + 
                hours + " gio " +
                minutes + " phut";
    }
}
