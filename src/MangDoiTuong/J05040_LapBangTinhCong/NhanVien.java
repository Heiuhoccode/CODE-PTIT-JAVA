/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05040_LapBangTinhCong;

import java.util.*;
public class NhanVien implements Comparable<NhanVien>{
    private String id="NV", name, role;
    private long dailyWage, workDay;
    //
    public NhanVien(int id, String name, long dailyWage, long workDay, String role){
        this.id = String.format("%s%02d", this.id, id);
        this.name = name;
        this.dailyWage = dailyWage;
        this.workDay = workDay;
        this.role = role;
    }
    //
    public static long getBonus(long workDay, long dailyWage){
        if(workDay >= 22){
            if(workDay >= 25){
                return (long) (dailyWage*workDay*0.2);
            }
            return (long) (dailyWage*workDay*0.1);
        }
        return (long) (dailyWage*workDay*0.0);
    }
    //
    public static long getAllowance(String role){
        if(role.equals("GD")) return 250000;
        if(role.equals("PGD")) return 200000;
        if(role.equals("TP")) return 180000;
        return 150000;
    }
    //
    public long getTotal(){
        return (dailyWage*workDay + getBonus(workDay,dailyWage) + getAllowance(role));
    }
    //
    public int compareTo(NhanVien other){
        return (int)(other.getTotal() - this.getTotal());
        
    }
    //
    public String toString(){
        return id + " "  + name + " " + (dailyWage*workDay) + " " + getBonus(workDay, dailyWage) + " " + getAllowance(role) + " " + (dailyWage*workDay + getBonus(workDay,dailyWage) + getAllowance(role));
    }
}
//Bui Thi Trang
//45000
//23
//PGD
