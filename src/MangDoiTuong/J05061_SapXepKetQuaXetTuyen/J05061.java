/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05061_SapXepKetQuaXetTuyen;

import java.util.*;
public class J05061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<UngVien> dsuv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            UngVien ungvien = new UngVien(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            dsuv.add(ungvien);
        }
        Collections.sort(dsuv);
        for(UngVien x:dsuv){
            System.out.println(x);
        }
    }
    
}
