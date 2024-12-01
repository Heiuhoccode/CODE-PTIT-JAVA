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
public class J02008_BSNNCuaNSoNguyenDauTien {
    public static Scanner sc = new Scanner (System.in);
    public static long Usln(long a, long b){
        if(b==0){
            return a;
        }
        return Usln(b,a%b);
    }
    public static long Bsnn(long a, long b){
        return a*b/Usln(a,b);
    }
    public static void main(String[] args) {
        int test = sc.nextInt();
        while(test-- > 0){
            long number = sc.nextLong();
            long result = 1;
            for(long i=1; i<=number; i++){
                result = Bsnn(i,result);
            }
            System.out.println(result);
        }
    }
}
