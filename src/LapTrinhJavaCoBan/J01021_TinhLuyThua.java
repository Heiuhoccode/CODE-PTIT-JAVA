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
public class J01021_TinhLuyThua {
    public static Scanner sc = new Scanner(System.in);
    public static final int model = (int)(Math.pow(10, 9) + 7);
    public static  long calculator(long a, long b, int model){
        if(b == 0){
            return 1;
        }
        if(b%2!=0){
            long k = calculator(a,b-1,model);
            return (a*k)%model;
        }
        if(b%2==0){
            long k = calculator(a,b/2, model);
            return (k*k)%model;
        }
        return 0;
    }
    public static void main(String[] args) {
        long a = 1;
        long b = 1;
        while(a!=0 || b !=0){
            a = sc.nextLong();
            b = sc.nextLong();
            if(a==0&&b==0){
                break;
            }
            else{
                System.out.println(calculator(a,b,model));
            }
        }
    }
}
