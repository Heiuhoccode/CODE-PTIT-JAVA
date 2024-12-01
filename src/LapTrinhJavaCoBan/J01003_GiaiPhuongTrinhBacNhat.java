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
public class J01003_GiaiPhuongTrinhBacNhat {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double x;
        if(a==0&&b!=0){
            System.out.println("VN");
        }
        else if(a==0&&b==0){
            System.out.println("VSN");
        }
        else{
            x = -1 * b / a ;
            System.out.printf("%.2f", x);
        }
    }
}
