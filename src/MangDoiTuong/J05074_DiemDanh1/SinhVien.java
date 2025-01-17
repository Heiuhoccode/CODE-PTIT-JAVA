/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05074_DiemDanh1;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String id, name, clas, status="";
    private int dcc;
    //
    public SinhVien(String id, String name, String clas){
        this.id = id;
        this.name = name;
        this.clas = clas;
    }
    //

    public String getId() {
        return id;
    }
    
    //
    public void setDCC(String data){
        int DCC = 10;
        for(int i=0; i<data.length(); i++){
            if(data.charAt(i)=='m'){
                DCC--;
            }
            else if(data.charAt(i)=='v'){
                DCC-=2;
            }
        }
        if(DCC > 0){
            this.dcc = DCC;    
        }
        else{
            this.dcc = 0;
        }
        if(this.dcc == 0){
            this.status="KDDK";
        }
    }
    //
    public String toString(){
        return id + " " + name + " " + clas + " " + dcc + " " + status;
    }
}
