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
public class J02007_DemSoLanXuatHien {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test= sc.nextInt();
        for(int te = 1; te<=test; te++){
            
            int size = sc.nextInt();
            int A[] = new int[size];
            int check[] = new int[10005];
            for(int i=0; i<10005; i++){
                check[i] = 0;
            }
            for(int i=0; i<size; i++){
                A[i] = sc.nextInt();
                check[A[i]]++;
            }
            System.out.println("Test "+te+":");
            for(int i=0; i<size; i++){
                if(check[A[i]]!=0){
                    System.out.println(A[i]+" xuat hien "+check[A[i]]+" lan");
                    check[A[i]]=0;
                }
            }
        }
    }
}
