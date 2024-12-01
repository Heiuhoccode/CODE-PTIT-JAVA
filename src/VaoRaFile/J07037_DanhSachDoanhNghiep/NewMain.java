/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07037_DanhSachDoanhNghiep;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<DoanhNghiep> dsdn = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0){
            sc.nextLine();
            DoanhNghiep temp = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            dsdn.add(temp);
        }
        Collections.sort(dsdn);
        for(DoanhNghiep temp:dsdn){
            System.out.println(temp);
        }
        
    }
    
}
