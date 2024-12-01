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
public class J01009_TongGiaiThua {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long sum = 0;
        long multip = 1;
        int number = sc.nextInt();
        for(int i=1; i<= number; i++){
            multip *= i;
            sum += multip;
        }
        System.out.println(sum);
    }
}
