/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07054_TinhDiemTrungBinh;

import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        for(int i=1; i<=n; i++){
            SinhVien sinhvien = new SinhVien(i,sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            dssv.add(sinhvien);
        }
        Collections.sort(dssv);
        dssv.get(0).setRank(1);
        for(int i=1; i<dssv.size(); i++){
            double priorAvgScore = dssv.get(i-1).getAvgScore();
            dssv.get(i).Rank(priorAvgScore, i, i+1);
        }
        for(SinhVien temp:dssv){
            System.out.println(temp);
        }
    }
    
}
