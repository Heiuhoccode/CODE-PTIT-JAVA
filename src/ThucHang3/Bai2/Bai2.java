/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHang3.Bai2;

import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
public class Bai2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CongNhan> dscn = new ArrayList<>();
        while(n-- > 0){
            dscn.add(new CongNhan(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(dscn);
        for(CongNhan cn : dscn){
            System.out.println(cn);
        }
        
    }
    
}
//3
//01T
//Nguyen Van An
//08:00
//17:30
//06T
//Tran Hoa Binh
//09:05
//17:00
//01A
//Nguyen Van An
//08:00
//17:30