/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mang;
import java.util.*;
/**
 *
 * @author admin
 */
public class J02104_DanhSachCanh {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
//        int dsc[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
//                dsc[i][j] = sc.nextInt();
                int x = sc.nextInt();
                if(x==1 && j>i){
                    System.out.println("(" + (i+1) + "," + (j+1) +")");
                }
            }
        }
    }
}
