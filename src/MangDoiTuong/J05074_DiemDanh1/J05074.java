/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05074_DiemDanh1;

import java.util.*;
public class J05074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = n;
        ArrayList<SinhVien> dssv = new ArrayList<>();
        while(n-- > 0){
            dssv.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        while(m-- > 0){
            String id = sc.next().trim();
            String data = sc.nextLine().trim();
            for(SinhVien sv:dssv){
                if(sv.getId().equals(id)){
                    sv.setDCC(data);
                }
            }
        }
        for(SinhVien sv:dssv){
            System.out.println(sv);
        }
    }
    
}
//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm