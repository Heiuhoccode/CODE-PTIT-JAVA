/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VaoRaFile.J07057_DiemTuyenSinh;
import java.io.*;
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<ThiSinh> dsts = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<= n; i++){
            dsts.add(new ThiSinh(i,sc.nextLine(),Double.parseDouble(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(dsts);
        for(ThiSinh x:dsts){
            System.out.println(x);
        }
    }
    
}
