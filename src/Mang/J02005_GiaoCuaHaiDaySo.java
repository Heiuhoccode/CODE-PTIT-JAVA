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
public class J02005_GiaoCuaHaiDaySo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sizeA = sc.nextInt();
        int sizeB = sc.nextInt();
        int A[] = new int[sizeA];
        int B[] = new int[sizeB];
        int check[] = new int[1002];
        for(int i=0; i<1002; i++){
            check[i] = 0;
        }
        for(int i=0; i<sizeA; i++){
            A[i] = sc.nextInt();
            check[A[i]] = 1;
        }
        for(int i=0; i<sizeB; i++){
            B[i] = sc.nextInt();
            if(check[B[i]] == 1){
                check[B[i]] = 2;
            }
        }
        for(int i=0; i<1002; i++){
            if(check[i] == 2){
                System.out.print(i + " ");
            }
        }
    }
}

