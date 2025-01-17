/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05055_XepHangVanDongVien1;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

public class VanDongVien implements Comparable<VanDongVien>{
    private String id="VDV", name, date;
    private LocalTime timeStart, timeFinish;
    private int rank;
    //
    public VanDongVien(int id, String name, String date, String timeStart, String timeFinish){
        this.id = String.format("%s%02d", this.id, id);
        this.name = name;
        this.date = date;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        this.timeStart = LocalTime.parse(timeStart, format);
        this.timeFinish = LocalTime.parse(timeFinish, format);
    }
    //
    public LocalTime ThanhTichThucTe(){
        Duration temp = Duration.between(this.timeStart, this.timeFinish);
        LocalTime res = LocalTime.of((int)temp.toHours(),(int)(temp.toMinutes()%60), (int)(temp.getSeconds()%60));
        return res;
    }
    //
    public LocalTime UuTien(){
        String[] s = this.date.trim().split("/");
        int tuoi = 2021 - Integer.parseInt(s[2]);
        int uutien = 0;
        if(tuoi < 18) uutien = 0;
        else if(tuoi >=18 && tuoi <25){
            uutien = 1;
        }
        else if(tuoi >= 25 && tuoi <32){
            uutien = 2;
        }
        else if(tuoi >= 32) uutien = 3;
        LocalTime res = LocalTime.of(0,0,uutien);
        return res;
    }
    //
    public LocalTime ThanhTichXepHang(){
        Duration temp = Duration.between(this.UuTien(),this.ThanhTichThucTe());
        LocalTime res = LocalTime.of((int)temp.toHours(),(int)temp.toMinutes()%60, (int)temp.getSeconds()%60);
        return res;
    }
    //
    public void setRank(int i){    
        this.rank = i;
    }
    //

    public int getRank() {
        return rank;
    }
    
    public int compareTo(VanDongVien other){
        return this.ThanhTichXepHang().compareTo(other.ThanhTichXepHang());
    }

    public String getId() {
        return id;
    }
    //
    public String toString(){
        return id + " " + name + " " + this.ThanhTichThucTe() + " " + this.UuTien() + " " + this.ThanhTichXepHang() + " " + rank;
    }
}
