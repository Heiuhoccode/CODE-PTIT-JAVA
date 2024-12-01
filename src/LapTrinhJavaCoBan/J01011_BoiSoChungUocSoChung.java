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
public class J01011_BoiSoChungUocSoChung {
    public static Scanner sc = new Scanner(System.in);
    public static void bcnn_ucln(long a, long b){
        long uc = 0L;
        for(long i=a; i>=1; i--){
            if(a%i==0&&b%i==0){
                uc=i;
                break;
            }
        }
        long bc = a * b / uc;
        System.out.println(bc+" "+uc);
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            bcnn_ucln(a,b);
        }
    }
}
