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
public class J01005_ChiaTamGiac {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int test  = scanner.nextInt();
        while(test > 0){
            int N = scanner.nextInt();
            int H = scanner.nextInt();
            double cc = H / Math.sqrt(N);
            double dd = H / (N*cc);
            System.out.printf("%.6f ", cc);
            for(int i=2; i<= N-1; i++){
                double cc1 = cc * Math.sqrt(i);
//                double cc1 = cc * i * H / (N*dd);
//                double dd1 = i * H / (N*cc1);
                System.out.printf("%.6f ",cc1);
//                cc = cc1; dd = dd1;
            }
            System.out.print("\n");
            test--;
        }
    }
}