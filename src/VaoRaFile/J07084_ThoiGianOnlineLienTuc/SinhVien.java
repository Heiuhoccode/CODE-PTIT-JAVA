
package VaoRaFile.J07084_ThoiGianOnlineLienTuc;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private long timeOnline;
    
    //
    public SinhVien (String name, String start, String finish){
        this.name = name;
        this.timeOnline = TimeOnline(start,finish);
    }
    //
    public long TimeOnline(String start, String finish){
        LocalDateTime begin = change(start);
        LocalDateTime after = change(finish);
        long timeOnline = ChronoUnit.MINUTES.between(begin,after);
        return timeOnline;
    }
    //
    public LocalDateTime change(String s){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime a = LocalDateTime.parse(s, format);
        return a;
    }
    //
    public int compareTo(SinhVien other){
        if(this.timeOnline == other.timeOnline){
            return this.name.compareTo(other.name);
        }
        return (int)(other.timeOnline - this.timeOnline);
    }
    //
    public String toString(){
        return name + " " + timeOnline;
    }
}
