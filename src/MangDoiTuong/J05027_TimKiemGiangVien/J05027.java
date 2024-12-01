/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05027_TimKiemGiangVien;

import java.util.*;
public class J05027 {
    public static boolean check(GiangVien gv, String s){
        int i=0;
        int n = gv.getName().length();
        String name = gv.getName().toLowerCase();
        boolean check1 = false;
        while(i<(n-s.length()+1)){
            check1 = true;
            for(int j=0; j<s.length(); j++){
                if(name.charAt(i+j) != s.charAt(j)){
                    check1 = false;
                }
            }
            if(check1) break;
            i++;
        }
        if(check1) return true;
        return false;
    }
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
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(GiangVien gv:dsgv){
                if(check(gv,s.toLowerCase())){
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
//aN