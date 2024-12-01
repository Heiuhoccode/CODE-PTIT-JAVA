/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05010_SapXepDanhSachMatHang;
import java.util.*;
public class MatHang implements Comparable<MatHang>{
    private String Id ="", name, group;
    private double priceBuy, priceSell, profit;
    //
    public MatHang(int id, String name, String group, double priceBuy, double priceSell){
        this.Id = String.format("%s%01d", this.Id, id);
        this.name = name;
        this.group = group; 
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
        this.profit = priceSell - priceBuy;
    }
    //
    public int compareTo(MatHang other){
        return (int)(other.profit - this.profit);
    }
    //
    public String toString(){
        return String.format("%s %s %s %.2f", Id,name , group ,profit);
    }
    
}
