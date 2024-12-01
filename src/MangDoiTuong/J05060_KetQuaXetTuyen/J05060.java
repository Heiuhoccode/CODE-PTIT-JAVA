/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05060_KetQuaXetTuyen;

import java.util.*;
public class J05060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<UngVien> dsuv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            UngVien ungvien = new UngVien(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            dsuv.add(ungvien);
        }
        for(UngVien x:dsuv){
            System.out.println(x);
        }
    }
    
}
//3
//Doan Thi Kim
//13/03/1982
//8
//9.5
//Dinh Thi Ngoc Ha
//03/09/1996
//6.5
//8
//Tran Thanh Mai
//12/09/2004
//8
//9