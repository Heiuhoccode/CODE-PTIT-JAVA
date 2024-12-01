/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHang3.Bai2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
/**
 *
 * @author admin
 */
public class CongNhan implements Comparable<CongNhan>{
    private String id, name, status;
    private LocalTime timeIn, timeOut;
    //
    public CongNhan(String id, String name, String timeIn, String timeOut){
        this.id = id;
        this.name = name;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        this.timeIn = LocalTime.parse(timeIn, format);
        this.timeOut = LocalTime.parse(timeOut, format);
        this.status = getStatus();
    }
    //
    public long getTimeWork(){
        long timeWork = ChronoUnit.MINUTES.between(timeIn, timeOut) - 60;
        return timeWork;
    }
    //
    public String getStatus(){
        long timeWork = getTimeWork();
        if(timeWork >= 480){
            return "DU";
        }
        return "THIEU";
    }
    //
    public int compareTo(CongNhan other){
        if(Long.compare(other.getTimeWork(), this.getTimeWork())==0){
            return this.id.compareTo(other.id);
        }
        return Long.compare(other.getTimeWork(), this.getTimeWork());
    }
    //
    public String toString(){
        long hours = this.getTimeWork() / 60;
        long minutes = this.getTimeWork() % 60;
        return id + " " + name +" " + hours +" gio " + minutes + " phut " +status;
    }
}
