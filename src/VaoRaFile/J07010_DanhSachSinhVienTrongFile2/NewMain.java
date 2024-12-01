/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07010_DanhSachSinhVienTrongFile2;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        for(int i=1; i<=n; i++){
            sc.nextLine();
            SinhVien sv = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
            dsSV.add(sv);
        }
        for(SinhVien sv:dsSV){
            System.out.println(sv);
        }
    }
    
}
