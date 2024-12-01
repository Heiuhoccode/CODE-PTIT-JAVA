/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1.DanhSachLienLac;

/**
 *
 * @author admin
 */
class SinhVien implements Comparable<SinhVien>{
    private String ID,Name,Clas,Email,Sdt;
    
    public SinhVien(String ID, String Name, String Clas, String Email, String Sdt){
        this.ID = ID;
        this.Name = Name;
        this.Clas = Clas;
        this.Email = Email;
        this.Sdt = Sdt;
    }
    
    public int compareTo(SinhVien that){
        if(this.Clas.equals(that.Clas)){
            return this.ID.compareTo(that.ID);
        }
        return this.Clas.compareTo(that.Clas);
    }
    public String toString(){
        return String.format("%s %s %s %s 0%s", ID, Name, Clas, Email, Sdt);
    }
}
