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
public class J01001_HinhChuNhat {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int chieuDai = scanner.nextInt();
        int chieuRong = scanner.nextInt();
        if(chieuDai <= 0 || chieuRong <= 0){
            System.out.println("0");
        }
        else{
            System.out.println((chieuDai + chieuRong)*2 + " " + chieuDai*chieuRong);
        }
    }
}
