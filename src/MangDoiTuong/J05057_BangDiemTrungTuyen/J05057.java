/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MangDoiTuong.J05057_BangDiemTrungTuyen;
import java.util.*;
public class J05057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            ThiSinh ts = new ThiSinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            dsts.add(ts);
        }
        for(ThiSinh ts:dsts){
            System.out.println(ts);
            
        }
    }
}
//2
//KV2A002
//Hoang Thanh Tuan
//5
//6
//5
//KV2B123
//Ly Thi Thu Ha
//8
//6.5
//7