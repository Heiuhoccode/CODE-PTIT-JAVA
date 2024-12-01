/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J05081_DanhSachMatHang;

/**
 *
 * @author admin
 */
public class HangHoa implements Comparable<HangHoa> {
    private String ID = "MH";
    private String Name, Unit;
    private int Buy, Sell, Profit;
    //
    public HangHoa(String ID, String Name, String Unit, int Buy, int Sell){
        this.ID = this.ID + ID;
        this.Name = Name;
        this.Unit = Unit;
        this.Buy = Buy;
        this.Sell = Sell;
        this.Profit = this.Sell - this.Buy;
    }
    @Override
    public int compareTo(HangHoa other){
        return  other.Profit - this.Profit;
    }
    public String toString(){
        return ID + " " + Name + " " + Unit + " " + Buy + " " + Sell + " " + Profit;
    }
}
