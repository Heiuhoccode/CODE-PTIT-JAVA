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
public class J02004_MangDoiXung {
    public static Scanner sc = new Scanner(System.in);
    public static int max = (int)Math.pow(10, 9);
    public static boolean check(int doiXung[], int size){
        for(int i=0; i<size/2; i++){
            if(doiXung[i] != doiXung[size-1-i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            int size = sc.nextInt();
            int doiXung[] = new int[size]; 
            
            for(int i=0; i<size; i++){
                doiXung[i] = sc.nextInt();
            }
            if(check(doiXung,size)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
