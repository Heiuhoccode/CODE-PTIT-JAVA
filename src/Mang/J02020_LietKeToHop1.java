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
public class J02020_LietKeToHop1 {
    public static Scanner sc = new Scanner(System.in);
    public static int a[] = new int[11];
    public static int n,k, cnt=0;
    public static void print(){
        for(int i=1; i<=k; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public static void Try(int i){
        for(int j=a[i-1]+1; j<=n-k+i; j++){
            a[i] = j;
            if(i==k){
                cnt++;
                print();
            }
            else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
