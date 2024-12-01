/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ThucHanh2.Bai6;
import java.io.*;
import java.util.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> dssv = new ArrayList<>();
        while(n-- > 0){
            dssv.add(new SinhVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(dssv);
        for(SinhVien x:dssv){
            System.out.println(x);
        }
    }
    
}
