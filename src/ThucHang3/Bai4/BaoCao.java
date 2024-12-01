/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHang3.Bai4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author admin
 */
public class BaoCao {
    private String id,status;
    private LocalTime time;
    //
    public BaoCao(String id, String time){
        this.id = id;
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        this.time = LocalTime.parse(time, format);
        this.status = getStatus();
    }
    //
    public String getStatus(){
        LocalTime noon = LocalTime.parse("12:00");
        if(this.time.isBefore(noon)) return "SANG";
        return "CHIEU";
    }

    public String getId() {
        return id;
    }

    public String getTime() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm");
        return time.format(format);
//        if(this.status.equals("CHIEU")){
//            return time.minusHours(12);
//            
//        }
//        return time;
    }
    
}
