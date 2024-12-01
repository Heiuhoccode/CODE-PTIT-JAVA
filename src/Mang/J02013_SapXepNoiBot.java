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
public class J02013_SapXepNoiBot {
    public static Scanner sc = new Scanner(System.in);
//    public static void swap(int &a, int &b){
//        int temp = a;
//        a = b;
//        b = a;
//    }
    public static void print(int N[], int size){
        for(int i=0; i<size; i++){
            System.out.print(N[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int size = sc.nextInt();
        int N[] = new int[size];
        for(int i=0; i<size; i++){
            N[i] = sc.nextInt();
        }
        boolean tangdan = true;
        int cnt = 1;
        do{
            tangdan = true;
            for(int i=1; i<size; i++){
                if(N[i-1] > N[i]){
                    int temp = N[i-1];
                    N[i-1] = N[i];
                    N[i] = temp;
                    tangdan = false;
                }
            }
            if(tangdan == false){
                System.out.print("Buoc " + cnt + ": ");
                print(N,size);
                cnt++;
            }
            
        }while(tangdan == false);
        
    }
}
