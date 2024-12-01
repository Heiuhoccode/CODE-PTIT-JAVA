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
public class J02011_SapXepChon {
    public static Scanner sc = new Scanner(System.in);
    public static void print(int N[], int size){
        for(int i=0; i<size; i++){
            System.out.print(N[i] + " ");
        }
        System.out.println("");
    }
    public static boolean check(int N[], int size){
        for(int i=1; i<size; i++){
            if(N[i-1] > N[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int size = sc.nextInt();
        int N[] = new int[size];
        for(int i=0; i<size; i++){
            N[i] = sc.nextInt();
        }
        int cnt=0;
        for(int i=0; i<size-1; i++){
            
            cnt++;
            int min = 200;
            int position = i;
            for(int j=i; j<size; j++){
                if(min > N[j]){
                    min = N[j];
                    position = j;
                }
            }
            int temp = N[i];
            N[i] = N[position];
            N[position] = temp;
            System.out.print("Buoc " + cnt + ": ");
            print(N,size);  
            
        }
    }
}
