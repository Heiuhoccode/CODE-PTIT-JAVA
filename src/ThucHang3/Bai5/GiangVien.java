/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHang3.Bai5;

/**
 *
 * @author admin
 */
public class GiangVien {
    private String idGV, nameGV;
    private double time=0.0;
    //
    public GiangVien(String id, String name){
        this.idGV = id;
        this.nameGV = name;
    }
    //
    public void addTime(double time){
        this.time+=time;
    }
    public String getIdGV() {
        return idGV;
    }

    public String getNameGV() {
        return nameGV;
    }
    public String toString(){
        return String.format("%s %s %.2f", idGV, nameGV, time);
    }
}
