/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BAITAP.Bai1;
import java.util.*;
import java.io.*;
public class NewMain {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int n = sc.nextInt();
        while(n-- > 0){
            int sohang, socot, value;
            sohang = sc.nextInt();
            socot = sc.nextInt();
            value = sc.nextInt();
            int giatri[][] = new int[sohang][socot];
            for(int i=0; i<sohang; i++){
                for(int j=0; j<socot; j++){
                    giatri[i][j] = sc.nextInt();
                }
            }
            Matrix A = new Matrix(sohang, socot, giatri);
            Matrix B = A.sapxepcot(value);
            System.out.println(B);
        }
    }
    
}
