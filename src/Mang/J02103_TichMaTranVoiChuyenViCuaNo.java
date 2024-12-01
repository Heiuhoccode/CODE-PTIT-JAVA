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
public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        for(int te=1; te<=test; te++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            int c[][] = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    for(int k=0; k<n; k++){
                        c[i][k] += a[i][j]*b[j][k];
                    }
                }
            }
            System.out.println("Test " + te +": ");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
