
package VaoRaFile.J07056_TinhTienDien;

import java.util.*;
public class KhachHang implements Comparable<KhachHang>{
    private String id="KH", name, rank;
    private int input, output, payinnorm, payoutnorm, paytotal, norm, tax;
    //
    public KhachHang(int i,String name, String addInfo){
        this.id = String.format("%s%02d", this.id, i);
        this.name = changeName(name);
        String[] addinfo = addInfo.trim().split("\\s+");
        this.rank = addinfo[0];
        this.input = Integer.parseInt(addinfo[1]);
        this.output = Integer.parseInt(addinfo[2]);
        this.norm = Norm(rank);
        this.payinnorm = PayInNorm(input, output, norm);
        this.payoutnorm = PayOutNorm(input, output, norm);
        this.tax = Tax(payoutnorm);
        this.paytotal = PayTotal(payinnorm, payoutnorm, tax);
    }
    //
    public int Norm(String rank){
        if(rank.equals("A")) return 100;
        if(rank.equals("B")) return 500;
        return 200;
    }
    //
    public int PayInNorm(int input, int output, int norm){
        if((output-input)>norm){
            return norm*450;
        }
        return (output-input)*450;
    }
    //
    public int PayOutNorm(int input, int output, int norm){
        if((output-input)>norm){
            return (output-input-norm)*1000;
        }
        return 0;
    }
    //
    public int Tax(int payoutnorm){
        return (int)(payoutnorm*0.05);
    }
    //
    public int PayTotal(int payinnorm, int payoutnorm, int tax){
        return payinnorm + payoutnorm + tax;
    }
    //
    public int compareTo(KhachHang other){
        return other.paytotal - this.paytotal;
    }
    //
    public String changeName(String name){
        String newFullName = "";
        String[] partName = name.trim().toLowerCase().split("\\s+");
        for(String partname:partName){
            String newPartName = String.valueOf(partname.charAt(0)).toUpperCase() + partname.substring(1).toLowerCase();
            newFullName += newPartName +" ";
        }
        newFullName = newFullName.trim();
        return newFullName;
    }
    public String toString(){
        return id + " " + name + " " + payinnorm + " " + payoutnorm + " " + tax + " " + paytotal;
    }
}
