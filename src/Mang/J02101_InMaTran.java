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
public class J02101_InMaTran {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int a[][] = new int[101][101];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<n; i++){
                if(i%2==0){
                    for(int j=0; j<n; j++){
                        System.out.print(a[i][j] + " ");
                    }
                }
                else{
                    for(int j=n-1; j>=0; j--){
                        System.out.print(a[i][j] +" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
