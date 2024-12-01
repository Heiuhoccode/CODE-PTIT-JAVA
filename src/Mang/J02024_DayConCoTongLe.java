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
public class J02024_DayConCoTongLe {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int a[] = new int[16];
    public static int check[] = new int[16];
    public static void sort(){
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void print(){
        for(int i=0; i<n; i++){
            if(check[i] == 1){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
    }
    public static int tong(){
        int sum = 0;
        for(int i=0; i<n; i++){
            if(check[i]==1){
                sum += a[i];
            }
        }
        return sum;
    }
    public static void process(int i){
        
        for(int j=0; j<=1; j++){
            check[i]=j;
            if(i==n-1){
                int sum = tong();
                if(sum%2!=0){
                    print();
                }    
            }
            else{
                process(i+1);
            }   
        }
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            n = sc.nextInt();
            for(int i=0 ;i<n; i++){
                a[i] = sc.nextInt();
            }
            sort();
//            for(int i=0; i<n; i++){
//                System.out.print(a[i] + " ");
//            }
            process(0);
        }
    }
}
