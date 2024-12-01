/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J05033_SapXepThoiGian;

import java.util.*;
public class Time implements Comparable<Time> {
    private int hour, minutes, second;
    
    public Time(int hour, int minutes, int second){
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }
    @Override 
    public int compareTo(Time other){
        if(this.hour == other.hour){
            if(this.minutes == other.minutes){
                return this.second - other.second;
            }
            return this.minutes - other.minutes;
        }
        return this.hour - other.hour;
    }
    public String toString(){
        return hour + " " + minutes + " " + second;
    }
}
