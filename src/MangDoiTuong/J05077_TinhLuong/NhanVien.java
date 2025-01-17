/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05077_TinhLuong;

public class NhanVien {
    private String id, name, loai, phongban;
    private long luongcoban, ngaycong, thamnien;
    //
    public NhanVien(String id, String name, long luongcoban, long ngaycong){
        this.id = id;
        this.name = name;
        this.luongcoban = luongcoban;
        this.ngaycong = ngaycong;
        this.loai = String.valueOf(id.charAt(0));
        this.thamnien = Long.parseLong(id.substring(1, 3));
        this.phongban = id.substring(3,5);
    }
    //

    public String getPhongban() {
        return phongban;
    }
    
    //
    public void setPhongBan(String phongban){
        this.phongban = phongban;
    }
    //
    public int HeSoNhan(){
        if(loai.equals("A")){
            if(thamnien < 4) return 10;
            if(thamnien < 9) return 12;
            if(thamnien < 16) return 14;
            return 20;
        }
        if(loai.equals("B")){
            if(thamnien < 4) return 10;
            if(thamnien < 9) return 11;
            if(thamnien < 16) return 13;
            return 16;
        }
        if(loai.equals("C")){
            if(thamnien < 4) return 9;
            if(thamnien < 9) return 10;
            if(thamnien < 16) return 12;
            return 14;
        }
        if(loai.equals("D")){
            if(thamnien < 4) return 8;
            if(thamnien < 9) return 9;
            if(thamnien < 16) return 11;
            return 13;
        }
        return 0;
    }
    //
    public String toString(){
        return id + " " + name +  " " + phongban + " " + (long)(luongcoban*ngaycong*HeSoNhan()*1000);
    }
}
