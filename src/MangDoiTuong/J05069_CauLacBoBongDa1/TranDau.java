/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05069_CauLacBoBongDa1;

/**
 *
 * @author admin
 */
public class TranDau {
    private String id;
    private long CDV;
    //
    public TranDau(String id, long CDV){
        this.id = id;
        this.CDV = CDV;
    }
    //
    public String idCLB(){
        return id.substring(1,3);
    }

    public String getId() {
        return id;
    }

    public long getCDV() {
        return CDV;
    }
    
}
