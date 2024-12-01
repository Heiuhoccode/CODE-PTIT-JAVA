/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2.Bai10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author admin
 */
public class KhachHang implements Comparable<KhachHang>{
    private String id="KH", name, address;
    private SanPham sp;
    private int quantity;
    private Date purchase;
    private static int count=1;
    //
    public KhachHang (String name,String address,SanPham sp, int quantity, String purchase) throws ParseException{
        id = id + String.format("%02d", count++);
        this.name = name;
        this.sp = sp;
        this.address = address;
        this.quantity  = quantity;
        SimpleDateFormat temp = new SimpleDateFormat("dd/MM/yyyy");
        this.purchase = temp.parse(purchase);
    }
    //
    private Date ExpireDay(){
        Calendar cd = Calendar.getInstance();
        cd.setTime(purchase);
        cd.add(Calendar.MONTH,sp.getDue());
        return cd.getTime();
    }
    //
    public int compareTo(KhachHang other){
        return ExpireDay().compareTo(other.ExpireDay());
    }
    //
    public String toString(){
        SimpleDateFormat tempp = new SimpleDateFormat("dd/MM/yyyy");
        return id + " " + name + " " + address + " " + sp.getId() + " " + quantity*sp.getPrice() + " " + tempp.format(ExpireDay());
    }
}
