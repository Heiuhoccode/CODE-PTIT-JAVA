/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05067_QuanLyKhoXangDau;

/**
 *
 * @author admin
 */
public class Kho {
    private String id;
    private long quantity;
    //
    public Kho(String id, long quantity){
        this.id = id;
        this.quantity = quantity;
    }
    //
    public String Brand(){
        String temp = String.valueOf(id.charAt(id.length()-2)) + String.valueOf(id.charAt(id.length()-1));
        if(temp.equals("BP")) return "British Petro";
        if(temp.equals("ES")) return "Esso";
        if(temp.equals("SH")) return "Shell";
        if(temp.equals("CA")) return "Castrol";
        if(temp.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
    //
    public String Loai(){
        return String.valueOf(id.charAt(0));
    }
    //
    public long DonGia(){
        if(Loai().equals("X")) return 128000;
        if(Loai().equals("D")) return 11200;
        return 9700;
    }
    //
    public long Thue(){
        if(Brand().equals("Trong Nuoc")){
            return 0;
        }
        else{
            if(Loai().equals("X")) return (long)(quantity * 128000 * 0.03);
            if(Loai().equals("D")) return (long)(quantity * 11200 * 0.035);
            return (long) (9700 * quantity * 0.02);    
        }
        
        
    }
    public long ThanhTien(){
        return quantity * DonGia() + Thue();
    }
    //
    public String toString(){
        return id + " " + this.Brand() + " " + this.DonGia() + " " + this.Thue() +" "+ this.ThanhTien();
    }
}
