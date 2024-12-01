/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07051_TinhTienPhong;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class KhachHang implements Comparable<KhachHang>{
    
    private String Id = "KH", name, checkin, checkout;
    private int room, additionFee, total, stayDuration;
    //
    public KhachHang(int id, String name, int room, String checkin, String checkout, int additionFee){
        this.Id = String.format("%s%02d", this.Id, id);
        this.name = ChangeName(name);
        this.room = room;
        this.checkin = ChangeDate(checkin);
        this.checkout = ChangeDate(checkout);
        CalculateDate(this.checkin,this.checkout);
        this.additionFee = additionFee;
        CalculateTotal(this.room, this.additionFee, this.stayDuration);
    }
    //
    public void CalculateTotal(int room, int additionFee, int stayDuration){
        int feePerDay = 0;
        if(room >= 100 && room <=199){
            feePerDay = 25;
        }
        else if(room >= 200 && room <=299){
            feePerDay = 34;
        }
        else if(room >= 300 && room <=399){
            feePerDay = 50;
        }
        else {
            feePerDay = 80;
        }        
        this.total = feePerDay*stayDuration + additionFee;
    }
    //
    public void CalculateDate(String checkin,String checkout){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aDate= LocalDate.parse(checkin, format);
        LocalDate dDate= LocalDate.parse(checkout,format);
        this.stayDuration = (int)ChronoUnit.DAYS.between(aDate,dDate) +1;
    }
    //
    public String ChangeName(String s){
        String NewFullName = "";
        String[] FullName = s.trim().toLowerCase().split("\\s+");
        for(String PartName:FullName){
            String NewPartName = String.valueOf(PartName.charAt(0)).toUpperCase();
            for(int i=1;i<PartName.length(); i++){
                NewPartName += PartName.charAt(i);
            }
            NewFullName += NewPartName + " ";
        }
        return NewFullName;
    }
    //
    public String ChangeDate(String date){
        date = date.trim();
        String[] partdate = date.split("/");
        
        if(partdate[0].length()==1){
            partdate[0] = "0" + partdate[0];
        }
        if(partdate[1].length()==1){
            partdate[1] = "0" + partdate[1];
        }
        String NewDate = "";
        NewDate = partdate[0] + "/" + partdate[1] + "/" + partdate[2];
        return NewDate;
    }
    //
    public int compareTo(KhachHang other){
        return other.total - this.total;
    }
    //
    public String toString(){
        return Id + " " + name + " " + room + " " + stayDuration + " " + total;
    }
}
