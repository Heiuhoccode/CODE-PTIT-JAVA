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
public class J02034_BoSungDaySo {
    public static Scanner sc = new Scanner(System.in);
    public static boolean check[] = new boolean[205];
    public static void main(String[] args) {
        int size = sc.nextInt();
        int N[] = new int[size];
        int max;
        for(int i=0; i<size; i++){
            N[i] = sc.nextInt();
            check[N[i]] = true;
        }
        max = N[size-1];
        int cnt=0;
        for(int i=1; i<=max; i++){
            if(check[i] == false){
                cnt++;
                System.out.println(i);
            }
        }
        if(cnt==0){
            System.out.println("Excellent!");
        }
    }
}
