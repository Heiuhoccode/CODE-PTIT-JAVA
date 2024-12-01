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
public class J02022_SoXaCach {
    public static Scanner sc = new Scanner(System.in);
    public static int a[] = new int[12];
    public static int n, ok=0;
//    public static int check(){
//        for(int i=1; i<=n-1; i++){
//            if(a[i] < a[i+1]){
//                return 0;
//            }
//        }
//        return 1;
//    }
    public static void sinhhoanvi(){
        int i=n-1;
        while(i>=1 && a[i+1] < a[i]) i--;
        if(i>=1){
            int j=n;
            while(j>i && a[j] < a[i]) j--;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            int r = i+1, s = n;
            while(r<s){
                int temp1 = a[r];
                a[r] = a[s];
                a[s] = temp1;
                r++; s--;
            }
        }
        else{
            ok=1;
        }
    }
    public static int check1(){
        for(int i=2; i<=n; i++){
            if(Math.abs(a[i-1] - a[i]) == 1){
                return 0;
            }
        }
        return 1;
    }
    public static void print(){
        for(int i=1; i<=n; i++){
            System.out.print(a[i]);
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            n = sc.nextInt();
            for(int i=1; i<=n; i++){
                a[i] = i;
            }
            //print();
            while(ok==0){
                if(check1() == 1){
                    print();
                }
                sinhhoanvi();
            }
            ok=0;
        }
    }
}
