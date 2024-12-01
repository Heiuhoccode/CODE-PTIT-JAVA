/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KhaiBaoLopVaDoiTuong.J07058_DanhSachMonThi;
import java.io.*;
import java.util.*;
/**
 *
 * @author admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner (new File("MONHOC.in"));
        int n = sc.nextInt();
       
        ArrayList<MonHoc> dsMH = new ArrayList<>();
                    sc.nextLine();

        while(n-- > 0){
            MonHoc temp = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            dsMH.add(temp);
        }
        Collections.sort(dsMH);
        for(MonHoc x:dsMH){
            System.out.println(x);
        }
    }
    
}
