/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J04005_KhaiBaoLopThiSinh;

import java.lang.*;
import java.util.*;
public class ThiSinh {
    private String name;
    private String NSinh;
    private float mark1, mark2, mark3, markSum;
    //
    public String getName(){
        return name;
    }
    public String getNSinh(){
        return NSinh;
    }
    public float getMark1(){
        return mark1;
    }
    public float getMark2(){
        return mark2;
    }
    public float getMark3(){
        return mark3;
    }
    public float getMarkSum(){
        return markSum;
    }
    //
    public ThiSinh(String name, String Nsinh, float mark1, float mark2, float mark3){
        this.NSinh = Nsinh;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.name = name;
    }
    //
    public float Sum(){
        this.markSum = this.mark1 + this.mark2 + this.mark3;
        return markSum;
    }
    //
    public String toString(){
        return String.format("%s %s %.1f", getName(), getNSinh(), Sum());
    }
}
