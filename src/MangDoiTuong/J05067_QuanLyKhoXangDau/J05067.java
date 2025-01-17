/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05067_QuanLyKhoXangDau;

import java.util.*;
public class J05067 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Kho> dsk = new ArrayList<>();
        while(n-- > 0){
            dsk.add(new Kho(sc.next(), Long.parseLong(sc.nextLine().trim())));
            
        }
        for(Kho k:dsk){
            System.out.println(k);
        }
    }
    
}
//6
//N89BP 4500
//D00ES 3500
//X92SH 2600
//N89CA 4500
//D00MO 3500
//X92TN 2600