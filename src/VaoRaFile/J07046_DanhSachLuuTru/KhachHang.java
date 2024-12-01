/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07046_DanhSachLuuTru;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class KhachHang implements Comparable<KhachHang>{
    private String Id="KH", name, roomId, arrivalDate, departureDate;
    private long stayDuration;
    //
    public KhachHang(int id, String name, String roomId, String arrivalDate, String departureDate){
        this.Id = String.format("%s%02d", this.Id, id);
        this.name = name;
        this.roomId = roomId;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        //
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aDate= LocalDate.parse(arrivalDate, format);
        LocalDate dDate= LocalDate.parse(departureDate,format);
        this.stayDuration = ChronoUnit.DAYS.between(aDate,dDate);
    }
    //
    public int compareTo(KhachHang other){
        return (int) (other.stayDuration - this.stayDuration);
    }
    //
    public String toString(){
        return Id + " " + name + " " + roomId + " " + stayDuration;
    }
}
