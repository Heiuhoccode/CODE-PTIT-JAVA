/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHang3.Bai5;

/**
 *
 * @author admin
 */
public class GioChuan {
    private String idGV, idM;
    private double time;
    //
    public GioChuan(String idgv, String idm, double time){
        
        this.idGV = idgv;
        this.idM = idm;
        this.time = time;
    }
    //

    public String getIdGV() {
        return idGV;
    }

    public String getIdM() {
        return idM;
    }

    public double getTime() {
        return time;
    }
    
}
