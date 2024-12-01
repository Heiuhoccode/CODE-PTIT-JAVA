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
public class J01006_TinhSoFibonacci {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while(test > 0){
            int n = scanner.nextInt();
            long F[] = new long[92];
            F[0] = 1;
            F[1] = 1;
            for(int i=2; i<92; i++){
                F[i] = F[i-1] + F[i-2];
            }
            System.out.println(F[n-1]);
            test--;
        }
    }
}
