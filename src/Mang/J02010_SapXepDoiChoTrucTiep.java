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
public class J02010_SapXepDoiChoTrucTiep {
    public static Scanner sc = new Scanner(System.in);
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
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(N[i] > N[j]){
                    int temp = N[i];
                    N[i] = N[j];
                    N[j] = temp;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
            print(N,size);
        }
    }
}
