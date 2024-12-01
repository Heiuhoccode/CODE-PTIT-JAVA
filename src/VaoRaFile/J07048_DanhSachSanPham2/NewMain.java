/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07048_DanhSachSanPham2;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> dssp = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            SanPham sanpham = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            dssp.add(sanpham);
        }
        Collections.sort(dssp);
        for(SanPham x:dssp){
            System.out.println(x);
        }
    }
    
}
