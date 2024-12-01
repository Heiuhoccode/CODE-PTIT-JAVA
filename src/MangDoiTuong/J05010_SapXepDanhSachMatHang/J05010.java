/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MangDoiTuong.J05010_SapXepDanhSachMatHang;

import java.util.*;
import java.io.*;
public class J05010 {
   
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> dsmh = new ArrayList<>();
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            sc.nextLine();
            MatHang mathang = new MatHang(i,sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            dsmh.add(mathang);
        }
        Collections.sort(dsmh);
        for(MatHang x:dsmh){
            System.out.println(x);
        }
    }
}
