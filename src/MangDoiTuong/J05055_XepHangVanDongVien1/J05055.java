/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05055_XepHangVanDongVien1;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class J05055 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> a = new ArrayList<>();
        ArrayList<VanDongVien> b = new ArrayList<>();
        for(int i=1; i<=n; i++){
            VanDongVien temp = new VanDongVien(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
           a.add(temp);
           b.add(temp);
        }
        Collections.sort(b);
        a.forEach(e -> {
            for(int i=0; i<n; i++){
                if(b.get(i).ThanhTichXepHang().compareTo(e.ThanhTichXepHang()) == 0){
                    e.setRank(i+1);
                    break;
                }
            }
            System.out.println(e);
        });
    }
    
}
//4
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Nguyen Hoa Bien
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30