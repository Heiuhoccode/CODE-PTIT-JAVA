/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07073_DangKyHinhThucGiangDay;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            MonHoc monhoc = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(),sc.nextLine());
            dsmh.add(monhoc);
        }
        Collections.sort(dsmh);
        for(MonHoc monhoc : dsmh){
            if(!monhoc.getPracticalExam().equals("Truc tiep")){
                System.out.println(monhoc);
            }
        }
    }
    
}
