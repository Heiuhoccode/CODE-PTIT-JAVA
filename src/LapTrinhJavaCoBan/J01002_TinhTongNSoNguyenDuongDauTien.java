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
public class J01002_TinhTongNSoNguyenDuongDauTien {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int test  = scanner.nextInt();
        while(test > 0){
            long num = scanner.nextInt();
            long sum =(num+1)*num/2;
            System.out.println(sum);
            test--;
        }
    }
}
