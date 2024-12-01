/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile.J07048_DanhSachSanPham2;

import java.util.*;
public class SanPham implements Comparable<SanPham>{
    private String Id, name;
    private int price, insuranceTime;
    //
    public SanPham(String Id, String name, int price, int insuranceTime){
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.insuranceTime = insuranceTime;
    }
    //
    public int compareTo(SanPham other){
        if(this.price == other.price){
            return this.Id.compareTo(other.Id);
        }
        return other.price - this.price;
    }
    //
    public String toString(){
        return Id + " " + name + " " + price + " " + insuranceTime;
    }
}
