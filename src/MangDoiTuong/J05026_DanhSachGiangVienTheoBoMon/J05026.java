/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05026_DanhSachGiangVienTheoBoMon;

import java.util.*;
public class J05026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> dsgv = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            dsgv.add(new GiangVien(i, sc.nextLine(),sc.nextLine()));
        }
//        Collections.sort(dsgv);
        int req = Integer.parseInt(sc.nextLine());
        while(req-- > 0){
            String s = sc.nextLine();
            String[] temp = s.trim().toUpperCase().split("\\s+");
            String rs = "";
            for(String x:temp){
                rs += String.valueOf(x.charAt(0));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + rs + ":");
            for(GiangVien gv:dsgv){
                if(gv.getMajor().equals(rs)){
                   System.out.println(gv); 
                }
                
            }    
        }
        
    }   
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem