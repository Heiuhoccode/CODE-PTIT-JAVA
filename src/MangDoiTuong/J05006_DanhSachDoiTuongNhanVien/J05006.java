/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05006_DanhSachDoiTuongNhanVien;

import java.util.*;
public class J05006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=t; i++){
            String Name = sc.nextLine();
            String Sex = sc.nextLine();
            String DateOB = sc.nextLine();
            String Address = sc.nextLine();
            String TaxID = sc.nextLine();
            String DateOC = sc.nextLine();
            dsnv.add(new NhanVien(i,Name,Sex,DateOB, Address, TaxID, DateOC));
        }
        for(NhanVien nv:dsnv){
            System.out.println(nv);
        }
    }
    
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011