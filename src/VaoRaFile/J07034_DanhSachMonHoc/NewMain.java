/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07034_DanhSachMonHoc;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        while(n-- > 0){
            sc.nextLine();
            MonHoc temp = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt());
            dsmh.add(temp);
        }
        Collections.sort(dsmh);
        for(MonHoc temp:dsmh){
            System.out.println(temp);
        }
    }
    
}
