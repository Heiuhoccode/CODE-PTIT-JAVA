/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2.Bai6;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private int ac;
    private int sub;
    //
    public SinhVien(String name, String acsub){
        this.name = name;
        String temp[] = acsub.split("\\s+");
        this.ac = Integer.parseInt(temp[0]);
        this.sub = Integer.parseInt(temp[1]);
    }
    //
    public int compareTo(SinhVien other){
        if(this.ac == other.ac){
            if(this.sub == other.sub){
                return this.name.compareTo(other.name);
            }
            return Integer.compare(this.sub, other.sub);
        }
        return Integer.compare(other.ac, this.ac);
    }
    //
    public String toString(){
        return name + " " + ac + " " + sub;
    }
}
