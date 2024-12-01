/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LapTrinhJavaCoBan;
import java.util.*;

/**
 *
 * @author admin
 */
public class J01007_KiemTraSoFibonacci {
    public static int check(long num){
        long F[] = new long[92];
        F[0] = 0L; F[1] = 1L;
        
        for(int i=2; i<92; i++){
            F[i] = F[i-1] + F[i-2];
        }
        for(int i=0; i<92; i++){
            if(num == F[i]){
                return 1;
            }
            else if(num < F[i]){
                return 0;
            }
        }
        return 0;  
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        while ( test > 0){
            long number = sc.nextLong();
            if(check(number) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            test--;
        }
    }
}