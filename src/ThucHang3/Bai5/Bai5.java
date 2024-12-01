/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHang3.Bai5;

import java.io.*;
import java.util.*;
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1= new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        int n = sc1.nextInt();
        while(n-- > 0){
            dsmh.add(new MonHoc(sc1.next(), sc1.nextLine().trim()));
        }
        
        Scanner sc2= new Scanner(new File("GIANGVIEN.in"));
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        n = sc2.nextInt();
        while(n-- > 0){
            dsgv.add(new GiangVien(sc2.next(), sc2.nextLine().trim()));
        }
        
        Scanner sc3= new Scanner(new File("GioChuan.in"));
        
        n = sc2.nextInt();
        while(n-- > 0){
            String idgv = sc3.next();
            String idmh = sc3.next();
            double time = sc3.nextDouble();
            for(GiangVien x:dsgv){
                if(x.getIdGV().equals(idgv)){
                    x.addTime(time);
                    break;
                }
            }
            for(GiangVien x:dsgv){
                System.out.println(x);
            }
        }
        
    }
    
}
