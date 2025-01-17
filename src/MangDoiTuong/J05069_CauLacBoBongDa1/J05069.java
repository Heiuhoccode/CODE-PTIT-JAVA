/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05069_CauLacBoBongDa1;

import java.util.*;
public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> dsclb = new ArrayList<>();
        while(n-- > 0){
            dsclb.add(new CLB(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine())));
        }
        
        n = Integer.parseInt(sc.nextLine());
        ArrayList<TranDau> dstd = new ArrayList<>();
        while(n-- > 0){
            dstd.add(new TranDau(sc.next(), Long.parseLong(sc.nextLine().trim())));
        }
        for(TranDau td:dstd){
            for(CLB clb:dsclb){
                if(td.idCLB().equals(clb.getId())){
                    System.out.println(td.getId() + " " + clb.getName() + " " + td.getCDV()*clb.getGiave());
                }
            }
        }
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000