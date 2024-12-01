/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHang3.Bai3;

import java.util.*;
public class SinhVien implements Comparable<SinhVien>{
    private String id, name, clas, email, phoneNumber;
    //
    public SinhVien(String id, String name,String clas, String email,String phoneNumber){
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.email = email;
        this.phoneNumber = "0" + phoneNumber;
    }
    //
    public int compareTo(SinhVien other){
        if(this.clas.equals(other.clas)){
            return this.id.compareTo(other.id);
        }
        return this.clas.compareTo(other.clas);
    }
    //
    public String toString(){
        return id + " " + name + " " + clas + " " + email + " " + phoneNumber;
    }
}
