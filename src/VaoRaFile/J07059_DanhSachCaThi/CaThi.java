
package VaoRaFile.J07059_DanhSachCaThi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class CaThi implements Comparable<CaThi>{
    private String Id="C", room;
    private LocalDate date;
    private LocalTime time;
    //
    public CaThi(int id, LocalDate date, LocalTime time, String room){
        this.Id = String.format("%s%03d", this.Id, id);
        this.date = date;
        this.time = time;
        this.room = room;
    }
    //
    @Override
    public int compareTo(CaThi other){
        if(this.date.equals(other.date)){
            if(this.time.equals(other.time)){
                return this.Id.compareTo(other.Id);
            }
            return (this.time.isAfter(other.time) == true ? 1 : -1);
        }
        return (this.date.isAfter(other.date) == true ? 1 : -1);
    }
    //
    public String toString(){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Id + " " + date.format(formatDate) + " " + time + " " + room;
    }
}
