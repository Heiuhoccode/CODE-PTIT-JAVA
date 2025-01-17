/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05077_TinhLuong;

import java.util.*;
public class J05077 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String,String> map = new HashMap<>();
        while(n-- > 0){
            String a = sc.next();
            String b = sc.nextLine().trim();
            map.put(a, b);
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        
        while(n-- > 0){
            dsnv.add(new NhanVien(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine())));
        }
        for(NhanVien nv:dsnv){
            nv.setPhongBan(map.get(nv.getPhongban()));
        }
        for(NhanVien nv:dsnv){
            System.out.println(nv);
        }
    }
    
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//4
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24
//A12HC
//Tran Binh Minh
//65
//25
//B18KH
//Le Hoa Binh
//59
//24