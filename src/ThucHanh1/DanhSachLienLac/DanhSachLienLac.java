/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh1.DanhSachLienLac;
import java.io.*;
import java.util.*;

public class DanhSachLienLac {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> DS = new ArrayList<>();
        while(sc.hasNextLine()){
            DS.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(DS);
        for(SinhVien i:DS){
            System.out.println(i);
        }
    }
    
}
