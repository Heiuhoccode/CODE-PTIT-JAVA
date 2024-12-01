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
public class J02012_SapXepChen {
    public static Scanner sc = new Scanner(System.in);
    public static void process(int N[], int size){
        for(int i=1; i<size; i++){
            int temp = N[i];
            int j=i-1;
            System.out.print("Buoc " + j + ": ");
            for(int u=0; u<=j; u++){
                System.out.print(N[u] + " ");
            }
            System.out.println("");
            while(j>=0 && N[j] > temp){
                N[j+1] = N[j];
                j--;
            }
            N[j+1] = temp;
        }
        System.out.print("Buoc " + (size-1) + ": ");
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
        process(N,size);
    }
}
