/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2.Bai10;

/**
 *
 * @author admin
 */
public class SanPham {
    private String id, name;
    private int price, due;
    //
    public SanPham(String id, String name, int price, int due){
        this.due = due;
        this.id = id;
        this.name = name;
        this.price = price;
    }
    //
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDue() {
        return due;
    }
    
}
