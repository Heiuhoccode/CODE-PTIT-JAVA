/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05006_DanhSachDoiTuongNhanVien;

public class NhanVien {
    private String ID, Name, Sex, DateOB, Address, TaxID, DateOC;
    //
    
    public String getName(){
        return Name;
    }
    public String getSex(){
        return Sex;
    }
    public String getDateOB(){
        return DateOB;
    }
    public String getAddress(){
        return Address;
    }
    public String getTaxID(){
        return TaxID;
    }
    public String getDateOC(){
        return DateOC;
    }
    //
    public NhanVien(int id, String Name, String Sex, String DateOB, String Address, String TaxID, String DateOC){
        this.ID = String.format("%05d", id);
        this.Name = Name;
        this.Sex = Sex;
        this.DateOB = DateOB;
        this.Address = Address;
        this.TaxID = TaxID;
        this.DateOC = DateOC;
    }
    //
    
    public String toString(){
        return String.format("%s %s %s %s %s %s %s", ID, getName(), getSex(), getDateOB(), getAddress(), getTaxID(), getDateOC());
    }
}
